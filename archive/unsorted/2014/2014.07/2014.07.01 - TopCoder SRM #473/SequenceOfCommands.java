package fuku;

/**
 * System Test Passed
 */
public class SequenceOfCommands {

    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};

    public String whatHappens(String[] commands) {
        String cmd = "";
        for (int i = 0; i < commands.length; i++) {
            cmd += commands[i];
        }

        int idx = 0;
        long x = 0;
        long y = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < cmd.length(); j++) {
                char c = cmd.charAt(j);

                if (c == 'S'){
                    x += dx[idx];
                    y += dy[idx];
                } else if (c == 'R') {
                    idx += 3;
                } else if (c == 'L') {
                    idx += 1;
                }
                idx %= 4;
            }

            if (x == 0 && y ==0) return "bounded";
        }

        return "unbounded";
    }
}
