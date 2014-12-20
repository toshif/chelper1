
package tc.p417_DI_1;

public class TemplateMatching {

    String bestMatch(String text, String prefix, String suffix){
        int N = text.length();

        int ma_prescore = -1;
        int ma_totscore = -1;
        String candidate = "";
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j <= N; j++) {
                String s = text.substring(i, j);

                int prescore = 0;
                for (int k = 1; k <= s.length(); k++) {
                    String pre = s.substring(0, k);
                    if (prefix.endsWith(pre)) {
                        prescore = k;
                    }
                }

                int sufscore = 0;
                for (int k = 0; k < s.length(); k++) {
                    String suf = s.substring(k);
                    if (suffix.startsWith(suf)) {
                        sufscore = s.length() - k;
                        break;
                    }
                }

                int totscore = prescore + sufscore;

                boolean update = false;
                if (ma_totscore < totscore) {
                    update = true;
                } else if (ma_totscore == totscore) {
                    if (ma_prescore < prescore) {
                        update = true;
                    } else if (ma_prescore == prescore) {
                        if (s.compareTo(candidate) < 0) {
                            update = true;
                        }
                    }
                }

                if (update) {
                    ma_prescore = prescore;
                    ma_totscore = totscore;
                    candidate = s;
                }
            }
        }

        return candidate;
    }

}

