import java.util.Scanner;            
public class Six {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int rev = 0;
        
        while (n != 0) {
           int rem = n%10;
           rev = rev*10+rem;
           n/=10;
        }
        System.out.println("the reverse of entered number is "+ rev);
    }
}
