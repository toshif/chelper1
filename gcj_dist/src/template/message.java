package template;

public class message {

    /**
     * The number of nodes on which the solution is running
     */
    public static int NumberOfNodes() {
        return 10;
    }

    /**
     * The index (in the range [0 .. NumberOfNodes()-1]) of the node on which this
     * process is running.
     */
    public static int MyNodeId() {
        return 0;
    }

    public static void PutChar(int target, char value) {

    }

    public static void PutInt(int target, int value) {

    }

    public static void PutLL(int target, long value) {

    }

    /**
     * Send the message that was accumulated in the appropriate buffer to the
     * "target" instance, and clear the buffer for this instance.
     * <p>
     * This method is non-blocking
     */
    public static void Send(int target) {

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
        return 0;
    }


    public static char GetChar(int source) {
        return 'a';
    }

    public static int GetInt(int source) {
        return 0;
    }

    public static long GetLL(int source) {
        return 0L;
    }
}
