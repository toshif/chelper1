package fb1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by delluser on 2015/01/18.
 */
public class TaskBGen {
    public static void main(String[] args) throws FileNotFoundException {
        String outFile =  "B-my.gen1.txt";
        PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(outFile)));

        int N = 10000;

        out.println(1);
        out.println(N);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            char c = 'a';
            b.append(c);
        }
        for (int i = 0; i < N; i++) {
            char c = 'a';
            b.append(c);
            out.println(b.toString());
        }
        out.flush();
    }
}
