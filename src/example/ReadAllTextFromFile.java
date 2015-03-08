package example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * BE CAREFUL for the mmemory usage.
 *
 * Created by vaiouser on 2015/03/08.
 */
public class ReadAllTextFromFile {

    /**
     * Read the file into a String
     */
    static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    /**
     * Read the inputstream into a String
     */
    static String readIn(InputStream in) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        return sb.toString();
    }

}
