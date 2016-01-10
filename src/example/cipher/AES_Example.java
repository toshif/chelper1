package example.cipher;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

/**
 * Cipher Javadoc
 * https://docs.oracle.com/javase/8/docs/api/javax/crypto/Cipher.html
 * <p>
 * https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Cipher
 * <p>
 * By default, the key size is restricted to 128 bits for Sun JDK. To enable 256 bits, you need installing a security policy file.
 * <p>
 * http://karanbalkar.com/2014/02/tutorial-76-implement-aes-256-encryptiondecryption-using-java/
 * <p>
 * http://www.javamex.com/tutorials/cryptography/unrestricted_policy_files.shtml
 * <p>
 * Created by toshif on 1/10/16.
 */
public class AES_Example {

    /*
    * AES/CBC/PKCS5Padding (128 bits = 16 bytes)
    *
    * AES - Advanced Encryption Standard (Algorith Name)
    * https://en.wikipedia.org/wiki/Advanced_Encryption_Standard
    *
    * CBC - Cipher Block Chaining
    * https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation
    *
    * PKCS5Padding - Padding Scheme
    * https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Cipher
    * http://www.emc.com/emc-plus/rsa-labs/standards-initiatives/pkcs-5-password-based-cryptography-standard.htm
    *
     */
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";

    // Initialization Vector - must be 128 bits (16 bytes) long
    private static final String IV = "AAAAAAAAAAAAAAAA";

    // Secret key - must be 128 bits (16 bytes) long
    private static final String ENCRYPTION_KEY = "0123456789abcdef";

    public static void main(String[] args) throws Exception {
        final String plaintext = "text 123";
        System.out.println("plain: [" + plaintext + "]");

        byte[] encrypted = encrypt(plaintext, ENCRYPTION_KEY);
        System.out.println("encrypted: " + Arrays.toString(encrypted));
        System.out.println("length: " + encrypted.length);

        String decrypted = decrypt(encrypted, ENCRYPTION_KEY);
        System.out.println("decrypt: [" + decrypted + "]");
    }

    public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return cipher.doFinal(plainText.getBytes("UTF-8"));
    }

    public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
        return new String(cipher.doFinal(cipherText), "UTF-8");
    }

}
