package Moduuli2;
import java.util.Scanner;
public class Moduuli2osa3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give weight in grams: ");
        double weightInGrams = scanner.nextDouble();

        int leiviska = (int) (weightInGrams / (20 * 32 * 13.28));
        int naula = (int) ((weightInGrams % (20 * 32 * 13.28)) / (32 * 13.28));
        double luoti = ((weightInGrams % (20 * 32 * 13.28)) % (32 * 13.28)) / 13.28;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n", weightInGrams, leiviska, naula, luoti);

        scanner.close();
    }
}
