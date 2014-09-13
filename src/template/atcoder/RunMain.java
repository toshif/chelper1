package template.atcoder;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Actual runner of Main class
 */
public class RunMain {

    public static void main(String[] args) throws Exception {
        InputStream origSysIn = System.in;
        PrintStream origSysOut = System.out;

        // Create a stream to hold the output
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(bout);
        System.setOut(out);

        // Parse the inputs and expected from the file
        URL url = RunMain.class.getResource("./input.in");
        byte[] inBytes = Files.readAllBytes(Paths.get(url.toURI()));
        String inStr = new String(inBytes);
        String[] tests = inStr.split("-------TEST_END-------");

        for (int i = 0; i < tests.length; i++) {
            String test = tests[i];

            String input = test;
            String expected = null;
            if (test.contains("----EXPECTED----")){
                String[] arr = test.split("----EXPECTED----");
                input = arr[0];
                expected = arr[1].trim();
            }

            ByteArrayInputStream ins = new ByteArrayInputStream(input.getBytes());
            System.setIn(ins);

            // cleanup
            bout.reset();

            // Run the test
            origSysOut.printf("-------------------\n");
            origSysOut.printf("Test# %d\n", i);
            origSysOut.printf("Input: \n======\n%s=====\n\n", input);
            new Main().main(null);

            // capture the output
            out.flush();
            String ans = bout.toString();
            if (expected != null) {
                origSysOut.println("Expected:\n" + expected + "\n");
            }
            origSysOut.println("Answer:\n" + ans);

            if (expected != null) {
                String verdict = "OK";
                if (!expected.equals(ans.trim())) {
                    verdict = "NG";
                }
                origSysOut.println("Verdict: " + verdict);
            }
            origSysOut.printf("-------------------\n");
        }
    }

}
