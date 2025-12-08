//practicing strings
import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter any string");
        String text = inp.nextLine();
        String res = "";
        System.out.println("Enter 1 for UPPERCASE and 2 for lowercase.");
        int choice = inp.nextInt();
        if (choice == 1) {
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    char Cap = (char) (c - 32);
                    res += Cap;
                } else {
                    res += c;
                }

            }
            System.out.println("The uppercase is " + res);
        }
            if (choice == 2) {
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (c >= 'A' && c <= 'Z') {
                        char Cap = (char) (c + 32);
                        res += Cap;
                    } else {
                        res += c;
                    }

                }
                System.out.println("The Lowercase is " + res);
            }
        
    }
}
