package cipher.caesar;

import org.junit.*;
import static org.junit.Assert.*;

public class EncryptorTest {
   @Test
   public void encryptorEncode_withKey7() {
      String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
      String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
      int key = 7;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withKey7_and_mustAlwaysBeInCapital() {
      String plainText = "tHE QUICK BRoWN FOX JUMPs OVER THe LaZY DOG";
      String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
      int key = 7;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withNegativeKey_and_mustAlwaysBeInCapital() {
      String plainText = "tHE QUICK BRoWN FOX JUMPs OVER THe LaZY DOG";
      String cipherText = "OCZ LPDXF WMJRI AJS EPHKN JQZM OCZ GVUT YJB";
      int key = -5;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withMidNegativeKey_and_mustAlwaysBeInCapital() {
      String plainText = "tHE QUICK BRoWN FOX JUMPs OVER THe LaZY DOG";
      String cipherText = "UIF RVJDL CSPXO GPY KVNQT PWFS UIF MBAZ EPH";
      int key = -25;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withLargeKey_and_mustAlwaysBeInCapital() {
      String plainText = "tHE QUICK BRoWN FOX JUMPs OVER THe LaZY DOG";
      String cipherText = "VJG SWKEM DTQYP HQZ LWORU QXGT VJG NCBA FQI";
      int key = 50000;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withLargeNegativeKey_and_mustAlwaysBeInCapital() {
      String plainText = "tHE QUICK BRoWN FOX JUMPs OVER THe LaZY DOG";
      String cipherText = "NBY KOCWE VLIQH ZIR DOGJM IPYL NBY FUTS XIA";
      int key = -20000;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   
}
