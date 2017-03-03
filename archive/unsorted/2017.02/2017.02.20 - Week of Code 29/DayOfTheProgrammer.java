package fuku;

import utils.io.MyReader;
import java.io.PrintWriter;

public class DayOfTheProgrammer {
    public void solve(int testNumber, MyReader in, PrintWriter out) {

        int year = in.nextInt();

        if (year == 1918) {
            out.println("26.09.1918");
            return;
        }

        String prefix = "";
        if (year <= 1917) {
            if (year % 4 == 0) {
                prefix = "12.09";
            } else {
                prefix = "13.09";
            }
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
                prefix = "12.09";
            } else {
                prefix = "13.09";
            }
        }

        out.println(prefix + "." + year);
    }
}
