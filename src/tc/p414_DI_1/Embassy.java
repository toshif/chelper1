
package tc.p414_DI_1;

public class Embassy {

    int visaApplication(int[] forms, int dayLength, int openTime){
        int N = forms.length;
        int mi = 1000_000_000;
        int offset = 0;
        for (int i = 0; i < N; i++) {
            offset = forms[i];

            if (offset > forms[0]) continue;

            int time = -offset;
            for (int j = 0; j < N; j++) {
                time += forms[j];
                int timeInDay = time % dayLength;
                if (timeInDay <= openTime) continue;

                // if alreay closed, wait for the next day
                time += (dayLength - timeInDay);
            }

            int tot = offset + time;
            mi = Math.min(mi, tot);
        }

        return mi;
    }

}

