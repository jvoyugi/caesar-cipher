package cipher.caesar;

public class Encryptor {
    private int key;
    private String plainText;

    public Encryptor(int key, String plainText) {
        this.plainText = plainText.toUpperCase();
        this.key = key >= 0 ? key : 26 + key % 26;
    }

    public String encode() {
        char[] plainTextCharArray = plainText.toCharArray();
        char[] cipherTextCharArray = new char[plainTextCharArray.length];
        for (int index = 0; index < plainTextCharArray.length; index++) {
            char letter = plainTextCharArray[index];
            char cipherLetter = letter > 'Z' || letter < 'A' ? letter : (char) ((letter - 'A' + key % 26) % 26 + 'A');
            cipherTextCharArray[index] = cipherLetter;
        }
        return String.copyValueOf(cipherTextCharArray);
    }
}
