package template.hacker_rank;

import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Actual runner of Main class
 */
public class RunMain {

    static final Class MAIN_CLASS = template.hacker_rank.p1.Solution.class;

    public static void main(String[] args) throws Exception {
        InputStream origSysIn = System.in;
        PrintStream origSysOut = System.out;

        // Create a stream to hold the output
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(bout);
        System.setOut(out);

        // Parse the inputs and expected from the file
        URL inputDir = MAIN_CLASS.getResource("input");
        URL outputDir = MAIN_CLASS.getResource("output");

        origSysOut.printf("main class = [%s]\n", MAIN_CLASS);
        origSysOut.printf("input dir = [%s]\n", inputDir.getPath());

        String[] inputFiles = new File(inputDir.toURI()).list();
        Arrays.sort(inputFiles);

        boolean allTestsPassed = true;
        for (int i = 0; i < inputFiles.length; i++) {
            byte[] inBytes = Files.readAllBytes(Paths.get(inputDir.toURI()).resolve(inputFiles[i]));
            String inStr = new String(inBytes);

            byte[] expectedBytes = Files.readAllBytes(Paths.get(outputDir.toURI()).resolve(inputFiles[i].replace("input", "output")));
            String expectedStr = new String(expectedBytes);

            ByteArrayInputStream ins = new ByteArrayInputStream(inBytes);
            System.setIn(ins);

            // cleanup
            bout.reset();

            // Run the test
            origSysOut.printf("-------------------\n");
            origSysOut.printf("Test# %d\n", i);
            origSysOut.printf("Input: \n======\n%s\n======\n\n", inStr);

            // call the static main method
            Method mainMethod = MAIN_CLASS.getMethod("main", String[].class);
            Object instance = null;
            Object[] params = {null};
            mainMethod.invoke(instance, params);

            // capture the output
            out.flush();
            String ans = bout.toString();

            origSysOut.println("Expected:\n" + expectedStr + "\n");

            origSysOut.println("Answer:\n" + ans);

            String verdict = "OK";
            if (!expectedStr.equals(ans.trim())) {
                verdict = "NG";
                allTestsPassed = false;
            }
            origSysOut.println("Verdict: " + verdict);

            origSysOut.printf("-------------------\n");
        }

        if (allTestsPassed) {
            origSysOut.printf("\n");
            origSysOut.printf("All %s tests passed.\n", inputFiles.length);
        }
    }

}
