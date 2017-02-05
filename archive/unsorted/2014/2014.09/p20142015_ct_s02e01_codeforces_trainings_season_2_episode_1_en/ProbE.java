package p20142015_ct_s02e01_codeforces_trainings_season_2_episode_1_en;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * @author fuku
 */
public class ProbE {

    public static void main(String[] args) {
        SolX solver = new SolX();
        solver.solve(0, new Scanner(System.in), new PrintWriter(System.out));
    }

    public static void mainA(String[] args) throws FileNotFoundException {
        InputStream inputStream = ProbE.class.getResourceAsStream("E-small.in");
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(System.out);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            System.err.println("------------------");
            System.err.println("test " + (i + 1));
            SolX solver = new SolX();
            solver.solve(i, in, out);
        }
        out.close();
    }

    private static class SolX {

        class P {
            String mode;
            int trId;
        }

        Set<Integer> blokcedTrId = new HashSet<>();

        // item -> tradId
        Map<Integer, List<P>> lockedItem = new HashMap<>();

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            //in.nextLine();

            while (true) {
                String line = in.nextLine();
                //out.println(line);

                if (line.contains("#")) break;

                String[] a = line.split(" ");
                String mode = a[0];
                Integer trid = Integer.valueOf(a[1]);
                Integer itemId = Integer.valueOf(a[2]);

                P p = new P();
                p.mode = mode;
                p.trId = trid;

                if (blokcedTrId.contains(trid)) {
                    out.println("IGNORED");
                    continue;
                }

                if (!lockedItem.containsKey(itemId))
                    lockedItem.put(itemId, new ArrayList<P>());

                List<P> ps = lockedItem.get(itemId);
                if (ps.isEmpty()) {
                    ps.add(p);
                    out.println("GRANTED");
                    continue;
                }

                if ("X".equals(mode)) {
                    if (ps.size() > 1) {
                        out.println("DENIED");
                        blokcedTrId.add(trid);
                        continue;
                    } else {
                        if (ps.get(0).trId == trid) {
                            ps.get(0).mode = "X";
                            out.println("GRANTED");
                            continue;
                        } else {
                            out.println("DENIED");
                            blokcedTrId.add(trid);
                            continue;
                        }
                    }
                }

                P target = null;
                boolean exclu = false;
                for (P p1 : ps) {
                    if ("X".equals(p1.mode)) {
                        exclu = true;
                        target = p1;
                        break;
                    }

                    if (p.trId == p1.trId) {
                        target = p1;
                    }
                }

                if (target != null) {
                    if (target.trId == trid) {
                        out.println("GRANTED");
                        if ("X".equals(mode)) {
                            target.mode = mode;
                        }
                        continue;
                    } else {
                        out.println("DENIED");
                        blokcedTrId.add(trid);
                        continue;
                    }

                } else {
                    if (exclu) {
                        out.println("DENIED");
                        blokcedTrId.add(trid);
                        continue;
                    } else {
                        ps.add(p);
                        out.println("GRANTED");
                        continue;
                    }
                }
            }

            out.flush();
        }

    }

}

