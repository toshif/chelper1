package fuku;

/**
 * system test not passed
 *
 */
public class ChickenOracle {
    public String theTruth(int n, int eggCount, int lieCount, int liarCount) {

        // if egg is the answer
        boolean egg = isOK(n - lieCount, lieCount, eggCount, lieCount, liarCount, n);
        boolean chicken = isOK(lieCount, n - lieCount, eggCount, lieCount, liarCount, n);

        if (egg && chicken) {
            return "Ambiguous";
        } else if (egg) {
            return "The egg";
        } else if (chicken) {
            return "The chicken";
        }

        return "The oracle is a lie";
    }

    boolean isOK(int realEgg, int realChk, int eggCount, int lieCount, int liarCount, int n){
        int t = realEgg + liarCount - eggCount;
        System.out.println("t = " + t);
        if ( t % 2 != 0 || t < 0 ) return false;

        int a = t / 2;
        if (a > liarCount) return false;

        if (realChk - a < 0){
            return false;
        }

        System.out.println("a = " + a);
        return true;
    }
}
