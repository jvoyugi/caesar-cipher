package cipher.caesar;

import org.junit.*;
import static org.junit.Assert.*;

public class DecryptorTest {
    @Test
    public void decryptorDecode_withKey7() {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
        int key = 7;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withLargeKey() {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
        int key = 7000;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }
}
