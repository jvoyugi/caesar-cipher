/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cipher;

import java.io.Console;

import cipher.caesar.Decryptor;
import cipher.caesar.Encryptor;

public class App {

    public static void main(String[] args) {
        String choice;
        while (true) {
            Console choiceConsole = System.console();
            displayMenu();
            choice = choiceConsole.readLine();
            if (choice.equals("1"))
                encrypt();
            else if (choice.equals("2"))
                decrypt();
            else if (choice.equals("3"))
                break;
            else
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void displayMenu() {
        System.out.println("--------------CAESAR CIPHER-----------------");
        System.out.println("Please select an option:");
        System.out.print("\t1. Encrypt text\n\t2. Decrypt text\n\t3. Exit\nYour choice: ");
    }

    private static void encrypt() {
        Console encryptConsole = System.console();
        System.out.println("---------ENCRYPTION--------------");
        System.out.print("Please key in the plain text: ");
        String plainText = encryptConsole.readLine();
        System.out.print("Please enter the key: ");
        String keyInput = encryptConsole.readLine();
        try {
            int key = Integer.parseInt(keyInput);
            Encryptor encryptor = new Encryptor(key, plainText);
            System.out.println("Input String: " + encryptor.getPlainText());
            System.out.println("Encrypted String: " + encryptor.encode());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Key must be a number");
        }
    }

    private static void decrypt() {
        Console decryptConsole = System.console();
        System.out.println("---------DECRYPTION--------------");
        System.out.print("Please key in the cipher text: ");
        String plainText = decryptConsole.readLine();
        System.out.print("Please enter the key: ");
        String keyInput = decryptConsole.readLine();
        try {
            int key = Integer.parseInt(keyInput);
            Decryptor decryptor = new Decryptor(key, plainText);
            System.out.println("Input String: " + decryptor.getCipherText());
            System.out.println("Decrypted String: " + decryptor.decode());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Key must be a number");
        }
    }
}
