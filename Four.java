//goal -- learn various built-in string methods
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter any text and lets apply various string methods on it.");
        System.out.println("Enter text1.");
        String text1 = inp.nextLine();
                System.out.println("Enter text2.");
        String text2 = inp.nextLine();
        System.out.printf(
                "Choose the method you want to use on the text.%n1: UPC%2: LWC %n3: equals%n 4: trim%n 5: split%n 6: replace %n 7: charat%n8: Length%n 9: concat %n______________________");
        int choice = inp.nextInt();
        switch (choice) {
            case 1:
        System.out.println(text1.toUpperCase());
                break;
                case 2:
               System.out.println(text1.toLowerCase());
                break;
            case 3:
                System.out.println("text1 and text2 are equal"+text1.equals(text2));
                break;
            case 4:
                System.out.println("Trimmed text 1 is "+text1.trim());
                break;
            case 5:
                System.out.println("The splitted text is :"+text1.split(" "));
                break;
            case 6:
                System.out.println("text1 after replacing n with k is  "+ text1.replace('n','k'));
                break;
            case 7:
                System.out.println("The character at index 5 is : "+text1.charAt(5));
                break;
            case 8:
                System.out.println("The length of text 1 is : "+ text1.length());
                break;
            case 9:
                System.out.println("The strings after concatenation is : "+ text1.concat(text2));
                break;
            default:
                break;
        }
    }
}
