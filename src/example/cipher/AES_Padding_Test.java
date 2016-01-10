package example.cipher;

import java.util.Random;

/**
 * Created by macpro on 1/10/16.
 */
public class AES_Padding_Test {

    public static void main(String[] args) throws Exception {
        AES_Example aes = new AES_Example();
        Random random = new Random();

        String input = "";
        for (int i = 0; i < 35; i++) {
            byte[] encrypted = aes.encrypt(input, "key4567890abcdef");

            System.out.println("input length = " + input.length() + ", encrypted length = " + encrypted.length);

            // assert that the output length is .. 16 * (1 + input / 16)
            if ( encrypted.length != 16 * (1 + input.length() / 16) ) {
                throw new RuntimeException("length assertion fail.");
            }

            input += (char)('a' + random.nextInt() % ('z' - 'a' + 1));
        }

    }

}
