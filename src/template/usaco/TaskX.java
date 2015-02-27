package template.usaco;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fuku
 */
public class TaskX {
    public static void main(String[] args) throws IOException {
        String filename = "problemX";

        String inFile = filename + ".in";
        String outFile = filename + ".out";

        System.out.printf("Input File = [%s]\n", inFile);
        System.out.printf("Output File = [%s]\n", outFile);

        Scanner in = new Scanner(new BufferedReader(new FileReader(inFile)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

        Solver solver = new Solver();
        solver.solve(in, out);
        out.close();
    }

    static class Solver {

        public void solve(Scanner in, PrintWriter out) {
            int N = in.nextInt();

            String ans = "1";
        }
    }
}


