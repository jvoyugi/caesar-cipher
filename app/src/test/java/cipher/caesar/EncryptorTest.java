package cipher.caesar;

import org.junit.*;
import static org.junit.Assert.*;

public class EncryptorTest {

   private String plainText;

   @Before
   public void setUp() {
      plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
   }

   @Test
   public void encryptorEncode_withKey7() {
      String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
      int key = 7;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withKey7_and_mustAlwaysBeInCapital() {
      String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
      int key = 7;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withNegativeKey_and_mustAlwaysBeInCapital() {
      String cipherText = "OCZ LPDXF WMJRI AJS EPHKN JQZM OCZ GVUT YJB";
      int key = -5;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withMidNegativeKey_and_mustAlwaysBeInCapital() {
      String cipherText = "UIF RVJDL CSPXO GPY KVNQT PWFS UIF MBAZ EPH";
      int key = -25;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withLargeKey_and_mustAlwaysBeInCapital() {
      String cipherText = "VJG SWKEM DTQYP HQZ LWORU QXGT VJG NCBA FQI";
      int key = 50000;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }

   @Test
   public void encryptorEncode_withLargeNegativeKey_and_mustAlwaysBeInCapital() {
      String cipherText = "NBY KOCWE VLIQH ZIR DOGJM IPYL NBY FUTS XIA";
      int key = -20000;
      Encryptor encryptor = new Encryptor(key, plainText);
      assertEquals(encryptor.encode(), cipherText);
   }
}
