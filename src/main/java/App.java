import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();

            System.out.println("This is Caesar's Cipher, enter a text and we shall encrypt it for you: ");

            String inputText = myConsole.readLine();

            System.out.println("Thank you, now enter the shift: ");
            Integer inputShift = Integer.parseInt(myConsole.readLine());


    }
}

