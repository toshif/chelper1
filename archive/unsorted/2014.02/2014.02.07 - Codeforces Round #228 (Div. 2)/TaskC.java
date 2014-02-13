package fuku;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int[] arr = new int[N];
        int[] used = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.err.println("arr = " + Arrays.toString(arr));

        int piles = 1;
        int usedTot = 0;

        int cap = -1;
        int a = -1;
        while (usedTot < N) {
            if (a == -1) {
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (used[i] == 0) {
                        a = i;
                        used[i] = 1;
                        usedTot++;
                        cap = arr[i];
                        break;
                    }
                }
            }

            if (usedTot == N) break;

            if (cap == 0){
                piles++;
                a = -1;
                cap = -1;
                continue;
            }

            int b = 0;
            for (int i = a; i >= 0; i--) {
                if (used[i] == 0 && arr[i] == arr[a] - 1) {
                    b = i;
                    break;
                }
                if (arr[i] < arr[a] - 1) {
                    b = i + 1;
                    break;
                }
            }

            int c = -1;
            for (int i = b; i < arr.length; i++) {
                if (used[i] == 0) {
                    c = i;
                    break;
                }
            }
            if (c == -1) {
                for (int i = b - 1; i >= 0; i--) {
                    if (used[i] == 0) {
                        c = i;
                        break;
                    }
                }
            }

            if (c == -1) {
                break;
            }

            used[c] = 1;
            usedTot++;
            cap = Math.min(cap - 1, arr[c]);
            a = c;
        }

        out.println(piles);
    }
}
