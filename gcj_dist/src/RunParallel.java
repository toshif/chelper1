import dcj.message;

// ++++++++ choose the target Main here +++++++++
import template.Main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunParallel {

    public static void main(String[] args) throws Exception {
        System.out.printf("Starting ... \n");

        final int numOfNodes = 10;
        message.init(numOfNodes);

        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(numOfNodes);
        for (int i = 0; i < numOfNodes; i++) {
            final int nodeId = i;
            executor.execute(
                    new Runnable() {
                        @Override
                        public void run() {
                            message.initNode(nodeId, numOfNodes);
                            Main.main(new String[]{});
                        }
                    }
            );
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.HOURS);

        System.out.printf("Complete. \n");
        System.out.printf("Elapsed Time : " + (System.currentTimeMillis() - startTime) + " msec.");
    }

}
