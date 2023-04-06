package cipher.caesar;

public class Decryptor {

    private int key;
    private String cipherText;

    public Decryptor(int key, String cipherText) {
        this.cipherText = cipherText.toUpperCase();
        this.key = key-26;
    }

    public String decode() {
        char[] cipherTextCharArray = cipherText.toCharArray();
        char[] plainTextCharArray = new char[cipherTextCharArray.length];
        for (int index = 0; index < cipherTextCharArray.length; index++) {
            char cipherLetter = cipherTextCharArray[index];
            char letter = cipherLetter > 'Z' || cipherLetter < 'A' ? cipherLetter
                    : (char) ((cipherLetter - 'A' - key) % 26 + 'A');
            plainTextCharArray[index] = letter;
        }
        return String.copyValueOf(plainTextCharArray);
    }
}
