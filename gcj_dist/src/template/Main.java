package template;

public class Main {

    private final int MASTER_NODE = 0;
    private int numOfNodes;
    private int nodeId;

    Main() {
        nodeId = message.MyNodeId();
        numOfNodes = message.NumberOfNodes();
    }

    void doWork( ) {
        message.PutLL(MASTER_NODE, 1L);
        message.PutLL(MASTER_NODE, 5L);
        message.Send(MASTER_NODE);
    }

    void doMaster() {
        long ma = 0;
        for (int i = 0; i < numOfNodes; i++) {
            message.Receive(i);
            long lo = message.GetLL(i);
            long hi = message.GetLL(i);
            ma = Math.max(ma, hi - lo);
        }
        System.out.println(ma);
    }

    boolean isMaster( ) {
        return nodeId == MASTER_NODE;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.doWork();
        if (m.isMaster()) {
            m.doMaster();
        }
    }

}
