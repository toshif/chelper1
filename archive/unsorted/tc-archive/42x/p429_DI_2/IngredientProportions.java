
package tc.p429_DI_2;

// done mmysef
// passed sys test
// was relatively easy
public class IngredientProportions {

    int[] getMasses(String[] proportions){
        int N = 10;
        int[] id = new int[N];
        int[] prop = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            prop[i] = 1;
        }

        int maN = 0;
        for (String s : proportions) {
            int a = Integer.parseInt("" + s.charAt(1));
            int b = Integer.parseInt("" + s.charAt(8));
            int ap = Integer.parseInt("" + s.charAt(13));
            int bp = Integer.parseInt("" + s.charAt(15));

            maN = Math.max(maN, a);
            maN = Math.max(maN, b);

            ap *= prop[b];
            bp *= prop[a];

            int g = (int)gcd(ap, bp);
            ap /= g;
            bp /= g;

            int aid = id[a];
            int bid = id[b];

            for (int i = 0; i < N; i++) {
                if ( id[i] == aid ) prop[i] *= ap;
                if ( id[i] == bid ) prop[i] *= bp;
            }

            for (int i = 0; i < N; i++) {
                if ( id[i] == bid ) id[i] = aid;
            }
        }

        int[] ret = new int[maN + 1];
        for (int i = 0; i <= maN; i++) {
            ret[i] = prop[i];
        }

        return ret;
    }


    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

