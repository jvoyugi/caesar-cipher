package cipher.caesar;

public class Decryptor {

    private int key;
    private String cipherText;

    public Decryptor(int key, String cipherText) {
        this.cipherText = cipherText.toUpperCase();
        this.key = key % 26;
    }


    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getCipherText() {
        return this.cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public String decode() {
        char[] charArray = cipherText.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            char cipherLetter = charArray[index];
            char letter = cipherLetter > 'Z' || cipherLetter < 'A' ? cipherLetter
                    : (char) ((cipherLetter - 'A' + 26 - key) % 26 + 'A');
            charArray[index] = letter;
        }
        return String.valueOf(charArray);
    }
}
