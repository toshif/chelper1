package fuku;

import java.util.HashSet;
import java.util.Set;

public class NetworkXOneTimePad {
    public int crack(String[] plaintexts, String[] ciphertexts) {
        Set<String> keys = new HashSet<>();
        for (int i = 0; i < plaintexts.length; i++) {
            int p = Integer.parseInt(plaintexts[i], 2);
            for (int j = 0; j < ciphertexts.length; j++) {
                int c = Integer.parseInt(ciphertexts[j], 2);
                int a = p ^ c;
                String s = Integer.toBinaryString(a);
                while (s.length() < ciphertexts[0].length()){
                    s = "0" + s;
                }
                keys.add(s);
                System.out.println("s=" + s);
            }
        }

        return keys.size();
    }
}
