package fuku;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    int M = 'z' - 'a' + 1;

    class T {
        T[] child = new T[M];
    }

    T root = new T();

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long k = in.nextLong();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            T now = root;
            for (int j = 0; j < s.length(); j++) {
                int x = s.charAt(j) - 'a';
                if (now.child[x] == null) {
                    now.child[x] = new T();
                }
                now = now.child[x];
            }
        }

        boolean win = canWin();
        boolean lose = canLose();

        System.err.printf("win = %s, lose = %s\n", win, lose);

        long ret = 0;
        if (win && lose) ret = 0;
        else if (win && !lose) ret = (k) % 2;
        else if (!win && lose) ret = (k) % 2;

        if (ret == 0) out.print("Second");
        else out.print("First");
    }

    boolean canWin(){
        return dfsWin(root, 1) == 0;
    }

    int dfsWin(T now, int player){
        int ret = -1;
        for (int i = 0; i < M; i++) {
            if (now.child[i] != null) {
                int result = dfsWin(now.child[i], (player + 1) % 2);
                if (ret == -1) ret = result;

                if (result == player) {
                    ret = result;
                }
            }
        }

        if (ret == -1) ret = player;

        return ret;
    }

    boolean canLose(){
        return dfsLose(root, 1) == 1;
    }

    int dfsLose(T now, int player){
        int ret = -1;
        for (int i = 0; i < M; i++) {
            if (now.child[i] != null) {
                int result = dfsWin(now.child[i], (player + 1) % 2);
                if (ret == -1) ret = result;

                if (result != player) {
                    ret = result;
                }
            }
        }

        if (ret == -1) ret = player;

        return ret;
    }
}
