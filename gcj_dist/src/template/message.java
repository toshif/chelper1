package template;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class message {

    private static ArrayBlockingQueue<__Msg>[] msgBus;

    public static void init(int numOfNodes) {
        msgBus = new ArrayBlockingQueue[numOfNodes];
        for (int i = 0; i < numOfNodes; i++) {
            msgBus[i] = new ArrayBlockingQueue<>(10000);
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
                outMsgs[i] = new __Msg();
                outMsgs[i].sourceNodeId = nodeId;
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
        int sourceNodeId = -1;
        ArrayDeque<Long> body = new ArrayDeque<>();
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
        __nodeLocal.get().outMsgs[target].body.add((long)value);
    }

    public static void PutInt(int target, int value) {
        __nodeLocal.get().outMsgs[target].body.add((long)value);
    }

    public static void PutLL(int target, long value) {
        __nodeLocal.get().outMsgs[target].body.add((long)value);
    }

    /**
     * Send the message that was accumulated in the appropriate buffer to the
     * "target" instance, and clear the buffer for this instance.
     * <p>
     * This method is non-blocking
     */
    public static void Send(int target) {
        __Msg msg = __nodeLocal.get().outMsgs[target];
        if (msg.body.size() * 8 > 8_000_000) {
            // this "* 8" assumes the contents are long values
            // char : 2 bytes
            // int : 4 bytes
            // long : 8 bytes
            throw new IllegalArgumentException("The msg is bigger than 8 MB");
        }
        msgBus[target].add(msg);
        __nodeLocal.get().outMsgs[target] = new __Msg();
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
        __Node nodeInfo = __nodeLocal.get();
        __Msg msg = null;
        try {
            msg = msgBus[nodeInfo.nodeId].take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nodeInfo.inMsgs[source] = msg;
        return msg.sourceNodeId;
    }


    public static char GetChar(int source) {
        return (char)(__nodeLocal.get().inMsgs[source].body.removeFirst().intValue());
    }

    public static int GetInt(int source) {
        return __nodeLocal.get().inMsgs[source].body.removeFirst().intValue();
    }

    public static long GetLL(int source) {
        return __nodeLocal.get().inMsgs[source].body.removeFirst().longValue();
    }
}
