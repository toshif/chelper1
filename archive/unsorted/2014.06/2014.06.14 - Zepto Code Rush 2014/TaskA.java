package fuku;

import java.util.*;
import java.io.PrintWriter;

public class TaskA {

    private int x;

    class P {
        int h;
        int m;

        @Override
        public String toString() {
            return String.format("P<h=%s,m=%s>", h, m);
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        x = in.nextInt();
        LinkedList<P> p0 = new LinkedList<>();
        LinkedList<P> p1 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int type = in.nextInt();
            int h = in.nextInt();
            int m = in.nextInt();

            P p = new P();
            p.h = h;
            p.m = m;
            if (type == 0) p0.add(p);
            else p1.add(p);
        }

        Comparator<P> comparator = new Comparator<P>() {
            @Override
            public int compare(P o1, P o2) {
                if (o1.m == o2.m) {
                    return o1.h - o2.h;
                }
                return o1.m - o2.m;
            }
        };
        Collections.sort(p0, comparator);
        Collections.sort(p1, comparator);

        Collections.reverse(p0);
        Collections.reverse(p1);

        System.err.printf("p0=%s\n", p0);
        System.err.printf("p1=%s\n", p1);

        int t1 = find(clone(p0), clone(p1));
        System.err.printf("----\n");
        int t2 = find(clone(p1), clone(p0));
        int ma = Math.max(t1, t2);
        out.println(ma);
    }

    int find(LinkedList<P> p0, LinkedList<P> p1){
        int current = x;
        int next = 0;
        int tot = 0;
        while(!((next == 0 && p0.isEmpty()) || (next == 1 && p1.isEmpty()))){
            //System.err.printf("next=%s\n", next);
            LinkedList<P> t = p0;
            if (next == 1){
                t = p1;
            }

            int toRemove = -1;
            for (int i = 0; i < t.size(); i++) {
                if (t.get(i).h <= current) {
                    toRemove = i;
                    break;
                }
            }

            if (toRemove == -1) break;

            P p = t.remove(toRemove);
            current += p.m;
            tot++;

            //System.out.printf("remove p=%s\n", p);
            //System.out.printf("current=%s\n", current);

            next += 1;
            next %= 2;
        }

        return tot;
    }

    LinkedList<P> clone(LinkedList<P> p0){
        LinkedList<P> ret = new LinkedList<>();
        for (P p : p0) {
            ret.add(p);
        }
        return ret;
    }
}
