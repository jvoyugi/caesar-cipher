package cipher.caesar;

import org.junit.*;
import static org.junit.Assert.*;

public class DecryptorTest {
    private String plainText;

    @Before
    public void setUp() {
        plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    }

    @Test
    public void decryptorDecode_withKey7() {
        String cipherText = "AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN";
        int key = 7;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withLargeKey() {
        String cipherText = "ZNK WAOIQ HXUCT LUD PASVY UBKX ZNK RGFE JUM";
        int key = 7000;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withNegativeKey() {
        String cipherText = "LZW IMAUC TJGOF XGP BMEHK GNWJ LZW DSRQ VGY";
        int key = -8;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorDecode_withLargeNegativeKey() {
        String cipherText = "NBY KOCWE VLIQH ZIR DOGJM IPYL NBY FUTS XIA";
        int key = -21872;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorEncode_withLargeNegativeKey_and_mustAlwaysBeInCapital() {
        String cipherText = "NBy KOcWE VLIQH ZIr DOGJM IPYL NBY FUTS XIa";
        int key = -20000;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }

    @Test
    public void decryptorEncode_withMidNegativeKey_and_mustAlwaysBeInCapital() {
        String cipherText = "XLI UYMgO FVsAR JSB NYQtW SZIV XLI PEdC HSK";
        int key = -22;
        Decryptor decryptor = new Decryptor(key, cipherText);
        assertEquals(decryptor.decode(), plainText);
    }
}
