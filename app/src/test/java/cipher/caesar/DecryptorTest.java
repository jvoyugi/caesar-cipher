package cipher.caesar;
import org.junit.*;
import static org.junit.Assert.*;

public class DecryptorTest {
    @Test
    public void decryptorDecode_withKey7(){
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
       int key = 7;
       Decryptor decryptor = new Decryptor(key, cipherText);
       assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withLargeKey(){
       String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
       String cipherText = "ZNK WAOIQ HXUCT LUD PASVY UBKX ZNK RGFE JUM";
       int key = 7000;
       Decryptor decryptor = new Decryptor(key, cipherText);
       assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withNegativeKey(){
       String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
       String cipherText = "LZW IMAUC TJGOF XGP BMEHK GNWJ LZW DSRQ VGY";
       int key = -8;
       Decryptor decryptor = new Decryptor(key, cipherText);
       assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withLargeNegativeKey(){
       String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
       String cipherText = "NBY KOCWE VLIQH ZIR DOGJM IPYL NBY FUTS XIA";
       int key = -21872;
       Decryptor decryptor = new Decryptor(key, cipherText);
       assertEquals(decryptor.decode(), plainText);
    }

    @Test
   public void decryptorEncode_withLargeNegativeKey_and_mustAlwaysBeInCapital() {
      String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
      String cipherText = "NBy KOcWE VLIQH ZIr DOGJM IPYL NBY FUTS XIa";
      int key = -20000;
      Decryptor decryptor = new Decryptor(key, cipherText);
      assertEquals(decryptor.decode(), plainText);
   }
   @Test
   public void decryptorEncode_withMidNegativeKey_and_mustAlwaysBeInCapital() {
      String plainText = "tHE QUICK BRoWN FOX JUMPs OVER THe LaZY DOG";
      String cipherText = "XLI UYMGO FVSAR JSB NYQTW SZIV XLI PEDC HSK";
      int key = -22;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }
}
