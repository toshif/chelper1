package fuku;

import java.util.HashSet;
import java.util.Set;

/**
 * System Test Passed
 *
 * It failed once with the system test. resubmitted, changing parseInt to parseLong.
 * Be careful with the input element's length.
 *
 * This was a good problem to learn the symmetry of XOR operation.
 *
 */
public class NetworkXOneTimePad {
    public int crack(String[] plaintexts, String[] ciphertexts) {
        Set<String> keys = new HashSet<>();

        long[] pb = new long[plaintexts.length];
        for (int i = 0; i < plaintexts.length; i++) {
            pb[i] = Long.parseLong(plaintexts[i], 2);
        }

        for (int i = 0; i < plaintexts.length; i++) {
            long p = Long.parseLong(plaintexts[i], 2);
            B:
            for (int j = 0; j < ciphertexts.length; j++) {
                long c = Long.parseLong(ciphertexts[j], 2);
                long a = p ^ c;

                // check it works for all ciphers
                A:
                for (int k = 0; k < ciphertexts.length; k++) {
                    long d = Long.parseLong(ciphertexts[k], 2);
                    long p2 = d ^ a;
                    for (int l = 0; l < pb.length; l++) {
                        if ( pb[l] == p2 ) continue A;
                    }

                    continue B;
                }

                String key = Long.toBinaryString(a);
                while (key.length() < ciphertexts[0].length()){
                    key = "0" + key;
                }

                keys.add(key);
            }
        }

        return keys.size();
    }
}
