import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();

            System.out.println("Enter a text to be encrypted: ");
            String inputText = myConsole.readLine();

            System.out.println("Thank you, now enter the shift: ");
            Integer inputShift = Integer.parseInt(myConsole.readLine());

            Caesar inputCaesar = new Caesar(inputText, inputShift);
            String cipherText = inputCaesar.encrypt(inputText, inputShift);

            System.out.println("Your ciphered text is " + cipherText);




            System.out.println("Enter an encrypted text to be decrypted: ");
            String userEncryptedText = myConsole.readLine();

            System.out.println("Enter the shift of the encrypted text: ");
            Integer userEncryptedShift = Integer.parseInt(myConsole.readLine());





    }
}

