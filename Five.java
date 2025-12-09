import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter any number");
        int x = inp.nextInt();
        if (x <= 1) {

            System.out.println("not prime");
        }
        else{
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    System.out.println("not prime");
                    return;
                }

            }
    System.out.println("prime");}
    
 }   
}