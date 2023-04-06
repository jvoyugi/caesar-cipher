package cipher.caesar;

public class Decryptor {
    
    private short key;
    private String plainText;

    public Decryptor(short key, String plainText) {
        this.plainText = plainText.toUpperCase();
        this.key = key;
    }

    public String decode(){
        
        return "";
    }
}
