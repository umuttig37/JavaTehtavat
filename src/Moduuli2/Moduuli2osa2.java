package Moduuli2;
import java.util.Scanner;
public class Moduuli2osa2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Length of the first leg: ");
        int leg1 = Integer.parseInt(scanner.nextLine());

        System.out.printf("Length of the second leg: ");
        int leg2 = Integer.parseInt(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        System.out.printf("Hypotenuse is: %.1f\n", hypotenuse );

    }
}
