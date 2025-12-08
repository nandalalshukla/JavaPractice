//practice operators and operations
import java.util.*;

public class Two {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter an integer");
        int x = inp.nextInt();
        System.out.println("enter a double");
        double y = inp.nextFloat();
        System.out.println("enter an int");
        int z = inp.nextInt();
        int sum = (int)(x + y + z);
        double prod = x * y * z;
        boolean greaterThan = x > y;
        int And = x & z;
        int Or = x | z;
        int Nor = ~x;
        System.out.println("X is greater than Y :" + greaterThan);
        System.out.println("Sum of all is: "+sum);
        System.out.println("Product of all is: "+prod);
        System.out.println("And of x and z: "+And);
        System.out.println("Or of x and z: " + Or);
        System.out.println("Nor of x : " + Nor);
        


    }
}
