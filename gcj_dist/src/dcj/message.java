package dcj;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class message {

    private static final boolean TRACE = true;

    private static __MsgBus[] msgBus;

    public static void init(int numOfNodes) {
        msgBus = new __MsgBus[numOfNodes];
        for (int i = 0; i < numOfNodes; i++) {
            msgBus[i] = new __MsgBus(numOfNodes);
        }
    }

    public static void initNode(int nodeId, int numOfNodes) {
        __nodeLocal.get().init(nodeId, numOfNodes);
    }

    private static class __Node {
        private int nodeId;
        private int numOfNodes;

        private __Msg[] outMsgs;
        private __Msg[] inMsgs;

        public void init(int nodeId, int numOfNodes) {
            this.nodeId = nodeId;
            this.numOfNodes = numOfNodes;

            outMsgs = new __Msg[numOfNodes];
            inMsgs = new __Msg[numOfNodes];
            for (int i = 0; i < numOfNodes; i++) {
                outMsgs[i] = new __Msg(nodeId);
            }
        }
    }

    private static ThreadLocal<__Node> __nodeLocal = new ThreadLocal<__Node>() {
        @Override
        protected __Node initialValue() {
            return new __Node();
        }
    };

    private static class __Msg {
        final int sourceNodeId;
        final ArrayDeque<Long> body = new ArrayDeque<>();

        __Msg(int sourceNodeId) {
            this.sourceNodeId = sourceNodeId;
        }
    }

    private static class __MsgBus {
        private BlockingQueue<__Msg>[] msgQueues;
        private BlockingQueue<Integer> nodeQueue = new LinkedBlockingDeque<>();

        __MsgBus(int numOfNodes) {
            msgQueues = new BlockingQueue[numOfNodes];
            for (int i = 0; i < numOfNodes; i++) {
                msgQueues[i] = new LinkedBlockingDeque<__Msg>();
            }
        }

        __Msg take(int source) throws InterruptedException {
            if (source == -1) {
                source = nodeQueue.take();
                return msgQueues[source].take();
            } else {
                __Msg msg = msgQueues[source].take();
                nodeQueue.remove(Integer.valueOf(source));
                return msg;
            }
        }

        void add(int source, __Msg msg) {
            msgQueues[source].add(msg);
            nodeQueue.add(Integer.valueOf(source));
        }
    }

    // ------------ OFFICIAL API below ---------------

    /**
     * The number of nodes on which the solution is running
     */
    public static int NumberOfNodes() {
        return __nodeLocal.get().numOfNodes;
    }

    /**
     * The index (in the range [0 .. NumberOfNodes()-1]) of the node on which this
     * process is running.
     */
    public static int MyNodeId() {
        return __nodeLocal.get().nodeId;
    }

    public static void PutChar(int target, char value) {
        __nodeLocal.get().outMsgs[target].body.add((long) value);
    }

    public static void PutInt(int target, int value) {
        __nodeLocal.get().outMsgs[target].body.add((long) value);
    }

    public static void PutLL(int target, long value) {
        __nodeLocal.get().outMsgs[target].body.add((long) value);
    }

    /**
     * Send the message that was accumulated in the appropriate buffer to the
     * "target" instance, and clear the buffer for this instance.
     * <p>
     * This method is non-blocking
     */
    public static void Send(int target) {
        __Node node = __nodeLocal.get();
        __Msg msg = node.outMsgs[target];
        if (msg.body.size() * 8 > 8_000_000) {
            // this "* 8" assumes the contents are long values
            // char : 2 bytes
            // int : 4 bytes
            // long : 8 bytes
            throw new IllegalArgumentException("The msg is bigger than 8 MB");
        }
        msgBus[target].add(msg.sourceNodeId, msg);
        node.outMsgs[target] = new __Msg(node.nodeId);

        if ( TRACE ) {
            System.err.printf("TRACE: node %s sent a msg to node %s\n", node.nodeId, target);
        }
    }

    /**
     * You can call Receive(-1) to retrieve a message from any source, or with
     * source in [0 .. NumberOfNodes()-1] to retrieve a message from a particular
     * source.
     * <p>
     * It returns the number of the instance which sent the message (which is equal
     * to source, unless source is -1).
     * <p>
     * This method is blocking
     */
    public static int Receive(int source) {
        try {
            __Node node = __nodeLocal.get();
            __Msg msg = msgBus[node.nodeId].take(source);
            node.inMsgs[msg.sourceNodeId] = msg;
            if ( TRACE ) {
                System.err.printf("TRACE: node %s received a msg from node %s\n", node.nodeId, msg.sourceNodeId);
            }
            return msg.sourceNodeId;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static char GetChar(int source) {
        return (char) (__nodeLocal.get().inMsgs[source].body.removeFirst().intValue());
    }

    public static int GetInt(int source) {
        return __nodeLocal.get().inMsgs[source].body.removeFirst().intValue();
    }

    public static long GetLL(int source) {
        return __nodeLocal.get().inMsgs[source].body.removeFirst().longValue();
    }
}
