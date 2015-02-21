package fuku;

public class DecipherabilityEasy {
    public String check(String s, String t) {
        int N = s.length();
        for (int i = 0; i < N; i++) {
            StringBuilder ss = new StringBuilder(s);
            System.err.printf("ss=%s\n", ss);
            String r = ss.deleteCharAt(i).toString();
            System.err.printf("r=%s\n", r);

            if (t.equals(r)) {
                return "Possible";
            }
        }

        return "Impossible";
    }
}
