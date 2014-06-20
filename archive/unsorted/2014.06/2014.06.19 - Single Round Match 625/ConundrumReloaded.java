package fuku;

public class ConundrumReloaded {

    private char[] cs;
    private int N;

    public int minimumLiars(String answers) {
        answers = answers.replaceAll("\\?+", "?");
        System.out.println("answers = " + answers);
        if ( answers.contains("?") ) {
            int idx = answers.indexOf('?');
            String prev = answers.substring(0, idx+1);
            answers = answers.substring(idx+1) + prev;
        }

        System.out.println("answers after = " + answers);
        answers = answers.replaceAll("\\?+", "?");

        System.out.println("answers after 2 = " + answers);

        cs = answers.toCharArray();
        N = cs.length;

        boolean clean = true;
        int tot = 0;
        int next = 0;
        while(true){
            int[] r1 = numLa(next, true);
            int[] r2 = numLa(next, false);

            tot += Math.min(r1[0], r2[0]);

            next = r1[1];

            if (next == N) {
                break;
            }
        }

        if (!answers.contains("?")){
            if (!( isValid(true) || isValid(false) )){
                return -1;
            }
        }

        return tot;
    }

    int[] numLa(int s, boolean isHo){
        int cnt = 0;

        boolean isNextHo = isHo;
        int next = 0;
        for (int i = s; i < N; i++) {
            if (!isNextHo) cnt++;
            next = i;

            if (cs[i] == '?'){
                break;
            }
            if (isNextHo){
                if (cs[s] == 'L') {
                    isNextHo = false;
                } else {
                    isNextHo = true;
                }
            } else {
                if (cs[s] == 'L') {
                    isNextHo = true;
                } else {
                    isNextHo = false;
                }
            }
        }

        return new int[]{cnt, next+1, isNextHo ? 1 : 0};
    }

    boolean isValid(boolean isHo){
        boolean isNextHo = isHo;
        for (int i = 0; i < N; i++) {
            if (isNextHo){
                if (cs[i] == 'L') {
                    isNextHo = false;
                } else {
                    isNextHo = true;
                }
            } else {
                if (cs[i] == 'L') {
                    isNextHo = true;
                } else {
                    isNextHo = false;
                }
            }
        }

        return (isNextHo == isHo);
    }
}
