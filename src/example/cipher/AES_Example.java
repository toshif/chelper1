package example.cipher;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

/**
 *
 * https://docs.oracle.com/javase/8/docs/api/javax/crypto/Cipher.html
 *
 * Created by toshif on 1/10/16.
 */
public class AES_Example {

    // Initialization Vector
    static final String IV = "AAAAAAAAAAAAAAAA";

    static final String plaintext = "text 123";

    static final String encryptionKey = "0123456789abcdef";

    public static void main(String[] args) throws Exception {
        System.out.println("plain: [" + plaintext + "]");

        byte[] cipher = encrypt(plaintext, encryptionKey);
        System.out.println("cipher: " + Arrays.toString(cipher));
        System.out.println("length: " + cipher.length);

        String decrypted = decrypt(cipher, encryptionKey);
        System.out.println("decrypt: [" + decrypted + "]");
    }

    public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return cipher.doFinal(plainText.getBytes("UTF-8"));
    }

    public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");

        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return new String(cipher.doFinal(cipherText), "UTF-8");
    }

}
