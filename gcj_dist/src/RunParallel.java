import template.Main;
import template.message;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunParallel {

    public static void main(String[] args) throws Exception {
        final int numOfNodes = 10;

        ExecutorService executor = Executors.newFixedThreadPool(numOfNodes);
        for (int i = 0; i < numOfNodes; i++) {
            final int nodeId = i;
            executor.execute(() -> {
                message.__NodeInfo nodeInfo = message.__nodeInfoLocal.get();
                nodeInfo.nodeId = nodeId;
                nodeInfo.numOfNodes = numOfNodes;

                Main.main(new String[]{});
            });
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.HOURS);
    }

}
