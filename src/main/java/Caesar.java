import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        int i = 0;
        int shift = 3;
        char c1 = ' ';
        char c2 = ' ';
        String str2 = "";
        int length = message.length();
        while (i < length) {
            c1 = message.charAt(i);
            if ((c1 <= '@') || (c1 >= 91 && c1 <= 96) || (c1 >= 123)) {
                c2 = c1;
            }
            if (c1 == ' ') {
                c2 = ' ';
        }
            if ((c1 >= 88 && c1 <= 90) || (c1 >= 120 && c1 <= 122)) {
                c2 = (char) (c1 - (26 - shift));
            }
            else {
                c2 = (char) (c1 + 3);
            }

            str2 = str2 + c2;
            i++;
        }
        return str2;
    }

    public static String decryptCaesar(String message) {
         int i = 0;
        int shift = 3;
        char c1 = ' ';
        char c2 = ' ';
        String str2 = "";
        int length = message.length();
        while (i < length) {
            c1 = message.charAt(i);
            if ((c1 <= '@') || (c1 >= 91 && c1 <= 96) || (c1 >= 123) || (c1 == ' ')) {
                c2 = c1;
            }
            if ((c1 >= 65 && c1 <= 67) || (c1 >= 97 && c1 <= 99)) {
                c2 = (char) (c1 + (26 - shift));
            }
            else {
                c2 = (char) (c1 - 3);
            }

            str2 = str2 + c2;
            i++;
        }
        return str2;
    }
    

    public static String encryptCaesarKey(String message, int key) {
        
        int i = 0;
        char c1 = ' ';
        char c2 = ' ';
        String str2 = " ";
        int length = message.length();
        while (i < length) {
            c1 = message.charAt(i);
            if ((c1 <= 47) || (c1 >= 91 && c1 <= 96) || (c1 >= 123)) {
                c2 = c1;
            }
            if ((c1 >= 88 && c1 <= 90) || (c1 >= 120 && c1 <= 122)) {
                c2 = (char) (c1 - (26 - key));
            }
            else {
                c2 = (char) (c1 + 3);
            }

            str2 = str2 + c2;
            i++;
        }
        return str2;
    
    }

    public static String decryptCaesarKey(String message, int key) {
       int i = 0;
        char c1 = ' ';
        char c2 = ' ';
        String str2 = " ";
        int length = message.length();
        while (i < length) {
            c1 = message.charAt(i);
            if ((c1 <= 47) || (c1 >= 91 && c1 <= 96) || (c1 >= 123)) {
                c2 = c1;
            }
            if ((c1 >= 65 && c1 <= 67) || (c1 >= 97 && c1 <= 99)) {
                c2 = (char) (c1 + (26 - key));
            }
            else {
                c2 = (char) (c1 - 3);
            }

            str2 = str2 + c2;
            i++;
        }
        return str2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message1 = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message1));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
