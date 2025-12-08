//practiced input and output
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter name");
        String name = inp.nextLine();
        System.out.println("Enter age");
        int age = inp.nextInt();
        System.out.println("Enter cgpa");
        double cgpa = inp.nextDouble();
        System.out.println("Enter income");
        float income = inp.nextFloat();
        System.out.println("The details entered are : \n||\n||");
        System.out.println("Name:" + name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("CGPA: %.3f%n", cgpa);
        System.out.printf("Income: %.2f%n", income);
        System.out.println("Thank You!");

    }
}
