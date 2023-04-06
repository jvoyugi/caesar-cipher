package cipher.caesar;

public class Decryptor {
    
    private int key;
    private String plainText;

    public Decryptor(int key, String plainText) {
        this.plainText = plainText.toUpperCase();
        this.key = key;
    }

    public String decode(){
        char[] plainTextCharArray = plainText.toCharArray();
        char[] cipherTextCharArray = new char[plainTextCharArray.length];
        for (int index = 0; index < plainTextCharArray.length; index++) {
            char letter = plainTextCharArray[index];
        }
        return String.valueOf(cipherTextCharArray);
    }
}
