package fuku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TwoWaysSorting {
    public String sortingMethod(String[] stringList) {
        boolean isLex = true;
        String[] lex = stringList.clone();
        Arrays.sort(lex);
        for (int i = 0; i < stringList.length; i++) {
            if (!stringList[i].equals(lex[i])) isLex = false;
        }

        boolean isOr = true;
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < stringList.length; i++) {
            l.add(stringList[i]);
        }
        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("l = " + l);
        for (int i = 0; i < stringList.length; i++) {
            if (!stringList[i].equals(l.get(i))) isOr = false;
        }

        if (isLex && isOr) return "both";

        if (isLex) return "lexicographically";

        if (isOr) return "lengths";

        return "none";
    }
}
