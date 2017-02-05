package fuku;

public class TheQuestionsAndAnswersDivOne {
    public int find(int questions, String[] answers) {
        int y = 0;
        int n = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals("Yes")) y++;
            else n++;
        }

        int ymin = 0;
        int ymax = 0;
        if (y > 0) {
            ymin = 1;
            ymax = y;
        }

        int nmin = 0;
        int nmax = 0;
        if (n > 0) {
            nmin = 1;
            nmax = n;
        }


        for (int i = 0; i < (1 << questions); i++) {
            //System.out.println(" = " + Integer.toBinaryString(i));

            int yes = 0;
            for (int j = 0; j < questions; j++) {
                if (((1 << j) & i) > 0) yes++;
            }

            int no = questions - yes;

            if (!(ymin <= yes && yes < ymax)) continue;
            if (!(nmin <= no && no < nmax)) continue;


        }

        return 0;
    }

    int calc(int n, int k){

    }
}
