package fuku;

public class SpamChecker {
    public String spamCheck(String judgeLog, int good, int bad) {
        long tot = 0;
        for (int i = 0; i < judgeLog.length(); i++) {
            if (judgeLog.charAt(i) == 'o') tot += good;
            else tot -= bad;

            if (tot < 0) return "SPAM";
        }
        return "NOT SPAM";
    }
}
