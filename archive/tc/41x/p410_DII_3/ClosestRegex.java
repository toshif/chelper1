
package tc.p410_DII_3;

public class ClosestRegex {

    private String text;
    private String regex;

    class A {
        int cost = 10000987;
        String s = "";
    }

    A[][] a;

    String closestString(String text, String regex) {
        this.text = text;
        this.regex = regex;
        int N = text.length();
        int R = regex.length();

        a = new A[N + 1][R + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= R; j++) {
                a[i][j] = new A();
            }
        }
        a[0][0].cost = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < R; j++) {
                if (regex.charAt(j) == '*') continue;

                // System.err.printf("enter i=%s, j=%s \n", i, j);

                boolean isStar = false;
                if (j + 1 < R && regex.charAt(j + 1) == '*') isStar = true;

                if (isStar) {
                    // skip
                    update(i, j + 2, a[i][j].cost, a[i][j].s);

                    // match
                    if (text.charAt(i) == regex.charAt(j)) {
                        // move
                        update(i + 1, j + 2, a[i][j].cost, a[i][j].s + text.charAt(i));
                        // stay
                        update(i + 1, j, a[i][j].cost, a[i][j].s + text.charAt(i));
                    } else {
                        // move
                        update(i + 1, j + 2, a[i][j].cost + 1, a[i][j].s + regex.charAt(j));
                        // stay
                        update(i + 1, j, a[i][j].cost + 1, a[i][j].s + regex.charAt(j));
                    }
                } else {
                    if (text.charAt(i) == regex.charAt(j)) {
                        update(i + 1, j + 1, a[i][j].cost, a[i][j].s + text.charAt(i));
                    } else {
                        update(i + 1, j + 1, a[i][j].cost + 1, a[i][j].s + regex.charAt(j));
                    }
                }
            }
        }

        // 最初これを忘れて sys test 通らなかった
        for (int j = 0; j < R; j++) {
            boolean isStar = false;
            if (j + 1 < R && regex.charAt(j + 1) == '*') isStar = true;

            if (isStar){
                // skip
                update(N, j+2, a[N][j].cost, a[N][j].s);
            }
        }

        System.err.printf("cost=%s\n", a[N][R].cost);

        return a[N][R].s;
    }

    void update(int i, int j, int cost, String s) {
        if (a[i][j].cost > cost) {
            a[i][j].cost = cost;
            a[i][j].s = s;

//            System.err.printf("i=%d, j=%d, cost=%s, s=%s\n", i, j, cost, s);
        } else if (a[i][j].cost == cost) {
            if (s.compareTo(a[i][j].s) < 0) {
                a[i][j].s = s;
            }

//            System.err.printf("i=%d, j=%d, cost=%s, s=%s\n", i, j, cost, s);
        } else {
//            System.err.printf("not good : i=%d, j=%d, cost=%s, s=%s, a[i][j].cost=%s, a[i][j].s=%s \n", i, j, cost, s, a[i][j].cost, a[i][j].s);
        }
    }

}

