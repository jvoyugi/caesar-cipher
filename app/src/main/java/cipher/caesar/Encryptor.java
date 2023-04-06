package cipher.caesar;

public class Encryptor {
    private int key;
    private String plainText;

    public Encryptor(int key, String plainText) {
        this.plainText = plainText.toUpperCase();
        this.key = 26 + key % 26;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String encode() {
        char[] charArray = plainText.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            char letter = charArray[index];
            char cipherLetter = letter > 'Z' || letter < 'A' ? letter : (char) ((letter - 'A' + key) % 26 + 'A');
            charArray[index] = cipherLetter;
        }
        return String.valueOf(charArray);
    }
}
