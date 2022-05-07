import java.util.*;

public class CeaserCipher

{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plainText, int shiftKey)

    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {	
        	if (plainText.charAt(i) == ' ') {
        		cipherText += ' ';
        	}
        	else {
            int charPosition = plainText.charAt(i)-'a';
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        	}
        }

        return cipherText;
    }

    public static String decrypt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {	if (cipherText.charAt(i) == ' ') {
    		plainText += ' ';
    		}
    		else {
            int charPosition = (cipherText.charAt(i)-'a');
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
    		}
        }
        return plainText;
    }
    /*
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        System.out.println("Encrypted message: " + encrypt(message, 3));
        System.out.println("Decrypted message: " + decrypt(encrypt(message, 3), 3));
        sc.close();
    }
    */
}