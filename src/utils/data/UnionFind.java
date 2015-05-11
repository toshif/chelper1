package utils.data;

import java.util.Arrays;

/**
 * <pre>
 *  Time Complexity :
 *    Union: O(log n)
 *    Find: O(log n)
 *  Memory Space Complexity : O(n)
 * </pre>
 * <p/>
 * http://en.wikipedia.org/wiki/Disjoint-set_data_structure
 * <p/>
 * http://algs4.cs.princeton.edu/15uf/
 * <p/>
 * Find: Determine which subset a particular element is in.
 * Union: Join two subsets into a single subset.
 * <p/>
 * rank を使って tree を balance する。
 * <p/>
 * Created by toshif on 5/11/2015.
 */
public class UnionFind {

    public static void main(String[] args) {
        int N = 10;
        UF uf = new UF(N);
        uf.union(0, 3);
        uf.union(0, 5);
        uf.union(0, 6);
        uf.union(1, 2);
        uf.union(1, 3);

        System.out.printf("Union result : \n");
        for (int i = 0; i < N; i++) {
            System.out.printf("%s is in group %s\n", i, uf.find(i));
        }

        System.out.printf("---\n");

        System.out.printf("Now we have %s subsets.\n", uf.count);


        System.out.printf("---\n");

        System.out.printf("%s and %s connected ? : %s\n", 0, 2, uf.connected(0, 2));
        System.out.printf("%s and %s connected ? : %s\n", 0, 3, uf.connected(0, 3));
        System.out.printf("%s and %s connected ? : %s\n", 0, 7, uf.connected(0, 7));
    }

    static class UF {
        private int[] id;     // id[i] = parent of i
        private int[] rank;   // rank[i] = rank of subtree rooted at i
        private int count;    // number of subsets

        public UF(int N) {
            count = N;
            id = new int[N];
            rank = new int[N];
            for (int i = 0; i < N; i++) {
                id[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int p) {
            while (p != id[p]) {
                id[p] = id[id[p]]; // path compression by halving
                p = id[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int i = find(p);
            int j = find(q);
            if (i == j) return;

            // make root of smaller rank point to root of larger rank
            if (rank[i] < rank[j]) {
                id[i] = j;
            } else if (rank[i] > rank[j]) {
                id[j] = i;
            } else {
                id[j] = i;
                rank[i]++;
            }

            count--;
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }
    }

}
