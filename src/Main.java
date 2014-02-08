import java.util.Scanner;
import java.io.PrintStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author desc
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskA {
    int[] b;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }

        int sum_prev = do1();
        int sum = do1();
        while(true){
            if (sum == sum_prev){
                out.println(sum);
                return;
            }
            sum_prev = sum;
            sum = do1();
        }
    }

    int do1(){
        int mi = b[0];
        int ir = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] < mi) {
                mi = b[i];
                ir = i;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i] - b[j] > 0 && b[i] - b[j] < mi) {
                    mi = b[i] - b[j];
                    ir = i;
                }
            }
        }
        b[ir] = mi;

        System.err.println("mi=" + mi);
        System.err.println("ir=" + ir);

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            if (i == ir) {
                sum += mi;
                continue;
            }
            while (b[i] > 0) {
                if (b[i] < mi || b[i] - mi <= 0) {
                    break;
                }
                b[i] -= mi;
            }
            sum += b[i];
        }

        return sum;
    }
}

