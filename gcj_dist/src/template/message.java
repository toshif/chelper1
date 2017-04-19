package template;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class message {

    public static ArrayBlockingQueue<__Msg>[] msgBus;

    public static void init(int numOfNodes) {
        msgBus = new ArrayBlockingQueue[numOfNodes];
        for (int i = 0; i < numOfNodes; i++) {
            msgBus[i] = new ArrayBlockingQueue<>(10000);
        }
    }

    public static class __NodeInfo {
        public int nodeId;
        public int numOfNodes;

        private __Msg[] outMsgBuf;
        private __Msg[] inMsgBuf;

        public void init() {
            outMsgBuf = new __Msg[numOfNodes];
            inMsgBuf = new __Msg[numOfNodes];
            for (int i = 0; i < numOfNodes; i++) {
                outMsgBuf[i] = new __Msg();
                outMsgBuf[i].sourceNodeId = nodeId;
            }
        }
    }

    public static ThreadLocal<__NodeInfo> __nodeInfoLocal = new ThreadLocal<__NodeInfo>() {
        @Override
        protected __NodeInfo initialValue() {
            return new __NodeInfo();
        }
    };

    private static class __Msg {
        int sourceNodeId = -1;
        ArrayDeque<Long> buf = new ArrayDeque<>();
    }

    /**
     * The number of nodes on which the solution is running
     */
    public static int NumberOfNodes() {
        return __nodeInfoLocal.get().numOfNodes;
    }

    /**
     * The index (in the range [0 .. NumberOfNodes()-1]) of the node on which this
     * process is running.
     */
    public static int MyNodeId() {
        return __nodeInfoLocal.get().nodeId;
    }

    public static void PutChar(int target, char value) {
        __nodeInfoLocal.get().outMsgBuf[target].buf.add((long)value);
    }

    public static void PutInt(int target, int value) {
        __nodeInfoLocal.get().outMsgBuf[target].buf.add((long)value);
    }

    public static void PutLL(int target, long value) {
        __nodeInfoLocal.get().outMsgBuf[target].buf.add((long)value);
    }

    /**
     * Send the message that was accumulated in the appropriate buffer to the
     * "target" instance, and clear the buffer for this instance.
     * <p>
     * This method is non-blocking
     */
    public static void Send(int target) {
        __Msg msg = __nodeInfoLocal.get().outMsgBuf[target];
        msgBus[target].add(msg);
        __nodeInfoLocal.get().outMsgBuf[target] = new __Msg();
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
        __NodeInfo nodeInfo = __nodeInfoLocal.get();
        __Msg msg = null;
        try {
            msg = msgBus[nodeInfo.nodeId].take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nodeInfo.inMsgBuf[source] = msg;
        return msg.sourceNodeId;
    }


    public static char GetChar(int source) {
        return (char)(__nodeInfoLocal.get().inMsgBuf[source].buf.removeFirst().intValue());
    }

    public static int GetInt(int source) {
        return __nodeInfoLocal.get().inMsgBuf[source].buf.removeFirst().intValue();
    }

    public static long GetLL(int source) {
        return __nodeInfoLocal.get().inMsgBuf[source].buf.removeFirst().longValue();
    }
}
