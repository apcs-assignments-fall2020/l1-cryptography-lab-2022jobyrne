//Jennifer O'Byrne Cryptophraphy code - vigenere
import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String realmessage = message.toUpperCase();
        String realkey = key.toUpperCase();
        int i = 0;
        int i2 = 0;
        int shift = 0;
        //int shift2 = 0;
        int other = 0;
        char val = ' ';
        char c1 = ' ';
        char c2 = ' ';
        String str2 = "";
        //char value = ' ';
        int length = realmessage.length();
        int klength = realkey.length();
        while (i <= length) {   // && i <= length) { //finding shift
            if (i2 == klength) {
            i = 0;
        }
            val = realkey.charAt(i); //initial char
            //hypoethetical c

            other = val - 'A'; //3
            shift = other; //3 need to have it repeat the sequence, not just all three
            // c = 54
            //a = 52
            // a - c (chars) = the amount of the shift for each letter
            //shift2 = (char) val - 65;
            //int number = shift2;

            //for (i ) while (i <= length) {
            
                c1 = realmessage.charAt(i);
            if ((c1 >= 91 && c1 <= 96) || (c1 >= 123 || c1 <= 40)) {
                c2 = c1;
            }
            else {
                c2 = (char) (c1 + shift);
            // add code for finding the specific location of each character(eg c = 0 and a = 1) about shift = 
            }
        str2 = str2 + c2;
        i++;
        i2++;
        
    }
     return str2;
}

    

    public static String decryptVigenere(String message, String key) {
        String realmessage = message.toUpperCase();
        String realkey = key.toUpperCase();
        int i = 0;
        int i2 = 0;
        int shift = 0;
        int other = 0;
        char val = ' ';
        char c1 = ' ';
        char c2 = ' ';
        String str2 = "";
        int length = realmessage.length();
        int klength = realkey.length();
        while (i <= length) {
            if (i2 == klength) {
            i = 0;
        }
            val = realkey.charAt(i); 
            other = val - 'A'; 
            shift = other;
            c1 = realmessage.charAt(i);
            if ((c1 >= 91 && c1 <= 96) || (c1 >= 123 || c1 <= 40)) {
                c2 = c1;
            }
            else {
                c2 = (char) (c1 - shift);
            
            }
        str2 = str2 + c2;
        i++;
        i2++;
        
    }
     return str2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
