package cipher.caesar;
import org.junit.*;
import static org.junit.Assert.*;
public class EncryptorTest {
    @Test
    public void encryptorEncode_withKey7(){
       String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
       String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
       int key = 7;
       Encryptor encryptor = new Encryptor(key, plainText);
       assertEquals(encryptor.encode(), cipherText);
    }
    
}
