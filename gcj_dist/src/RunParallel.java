import template.Main;
import template.message;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunParallel {

    public static void main(String[] args) throws Exception {
        final int numOfNodes = 10;
        message.init(numOfNodes);

        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(numOfNodes);
        for (int i = 0; i < numOfNodes; i++) {
            final int nodeId = i;
            executor.execute(() -> {
                message.__NodeInfo nodeInfo = message.__nodeInfoLocal.get();
                nodeInfo.nodeId = nodeId;
                nodeInfo.numOfNodes = numOfNodes;
                nodeInfo.init();

                Main.main(new String[]{});
            });
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.HOURS);

        System.out.printf("Elapsed Time : " + (System.currentTimeMillis() - startTime) + " msec.");
    }

}
