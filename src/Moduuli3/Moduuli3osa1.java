package Moduuli3;
import java.util.Scanner;
public class Moduuli3osa1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = reader.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = reader.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = reader.nextDouble();


        double ans = b * b - 4 * a * c;

        if(ans >= 0){
            double root1 = (-b + Math.sqrt(ans)) / (2 * a);
            double root2 = (-b + Math.sqrt(ans)) / (2 * a);

            System.out.printf("root1: %.2f%n", root1);
            System.out.printf("root2: %.2f%n", root2);
        } else {
            System.out.println("No real roots");
        }
    }
}
