package fuku;

/**
 * System Test Passed
 */
public class ChickenOracle {
    private int n;
    private int eggCount;
    private int lieCount;
    private int liarCount;

    public String theTruth(int n, int eggCount, int lieCount, int liarCount) {
        this.n = n;
        this.eggCount = eggCount;
        this.lieCount = lieCount;
        this.liarCount = liarCount;

        System.out.println("egg check");
        boolean egg = isOK(eggCount);
        System.out.println("chicken check");
        boolean chicken = isOK(n - eggCount);

        if (egg && chicken) return "Ambiguous";
        if (egg) return "The egg";
        if (chicken) return "The chicken";

        return "The oracle is a lie";
    }

    boolean isOK(int x){
        int a = liarCount + x - (n - lieCount);
        System.out.println("a = " + a);
        if (a < 0) return false;
        if (a % 2 != 0) return false;
        a /= 2;

        if ( ( 0 <= a && a <= liarCount ) && ( a <= lieCount ) && ( liarCount - a <= n - lieCount)  ){
            return true;
        } else return false;
    }
}
