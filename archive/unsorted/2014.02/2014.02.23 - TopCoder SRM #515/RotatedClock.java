package fuku;

// System Test Passed
// http://apps.topcoder.com/wiki/display/tc/SRM+515
public class RotatedClock {
    public String getEarliest(int hourHand, int minuteHand) {
        // 1 hour = 30 degree
        // 1 min = 2 degree
        int d1 = hourHand  % 30;
        int mins = d1 * 2;
        int mins_d = mins * 6;

        int adj = mins_d - minuteHand;
        if (adj % 30 != 0)  return "";

        hourHand += adj;
        hourHand = ( hourHand + 360 ) % 360;

        int h = hourHand / 30;
        String ret = "" + h + ":";
        if (h < 10) ret = "0" + ret;

        if (mins < 10) ret = ret + "0";
        ret += mins;

        return ret;
    }
}
