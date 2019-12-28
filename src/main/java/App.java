import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();

            System.out.println("Enter a text to be encrypted: ");
            String inputText = myConsole.readLine();

            System.out.println("Thank you, now enter the shift: ");
            Integer inputShift = Integer.parseInt(myConsole.readLine());

            Caesar inputCaesarEncrypt = new Caesar(inputText, inputShift);
            String cipherText = inputCaesarEncrypt.encrypt(inputText, inputShift);

            System.out.println("Your encrypted text is " + cipherText);







    }
}

