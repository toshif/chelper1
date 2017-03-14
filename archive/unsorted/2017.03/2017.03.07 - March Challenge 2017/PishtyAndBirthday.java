package fuku;

import utils.data.BIT;
import utils.io.MyReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PishtyAndBirthday {

    private static int[] state;

    static {
        calcStates();
    }

    public void solve(int testNumber, MyReader in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();

        int[] cakes = new int[N];
        for (int i = 0; i < N; i++) {
            String s = "";
            for (int j = 0; j < 4; j++) {
                s += in.next();
            }
            int v = Integer.parseInt(s, 2);
            cakes[i] = state[v];
        }

        BIT[] bits = new BIT[17];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = new BIT(N);
        }

        for (int i = 0; i < N; i++) {
            bits[cakes[i]].add(i+1, 1);
        }

        for (int i = 0; i < M; i++) {
            int q = in.nextInt();
            if (q == 1) {
                int L = in.nextInt() - 1;
                int R = in.nextInt() - 1;

                int nsum = 0;
                for (int j = 1; j <= 16; j++) {
                    long hs = bits[j].getHeadSum(R+1);
                    hs -= (L == 0 ? 0 : bits[j].getHeadSum(L+1-1));
                    if (hs % 2 != 0) {
                        nsum ^= j;
                    }
                }
                if (nsum == 0) {
                    out.println("Lotsy");
                } else {
                    out.println("Pishty");
                }
            } else {
                int pos = in.nextInt() - 1;

                bits[cakes[pos]].add(pos+1, -1);

                String s = "";
                for (int j = 0; j < 4; j++) {
                    s += in.next();
                }
                int v = Integer.parseInt(s, 2);
                cakes[pos] = state[v];

                bits[cakes[pos]].add(pos+1, 1);
            }
        }

    }

    static void calcStates() {
        int NN = 1 << 16;
        state = new int[NN];
        Arrays.fill(state, 0);
        state[0] = 0;
        for (int i = 0; i < NN; i++) {
            List<Integer> possibleMoves = getPossibleMoves(i);

            boolean[] ss = new boolean[20];
            for (Integer t : possibleMoves) {
                ss[state[t]] = true;
            }

            for (int j = 0; j < ss.length; j++) {
                if (!ss[j]) {
                    state[i] = j;
                    break;
                }
            }
        }
    }

    static List<Integer> getPossibleMoves(int current) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            A:
            for (int j = 0; j < 4; j++) {
                int dot = 1 << (i * 4 + j);
                if ((current & dot) == 0) continue;

                // remove a rectangle
                for (int x = 0; x < 4; x++) {
                    if (i + x >= 4) continue;

                    C:
                    for (int y = 0; y < 4; y++) {
                        if (j + y >= 4) continue;

                        int target = current;
                        for (int x2 = 0; x2 <= x; x2++) {
                            for (int y2 = 0; y2 <= y; y2++) {
                                int targaetDot = 1 << ((i + x2) * 4 + (j + y2));
                                if ((current & targaetDot) == 0) continue C;

                                target ^= targaetDot;
                            }
                        }
                        ret.add(target);
                    }
                }
            }
        }
        return ret;
    }
}
