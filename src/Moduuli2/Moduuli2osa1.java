package Moduuli2;
import java.util.Scanner;
public class Moduuli2osa1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Give fahrenheit: ");
        double fahrenheit = Double.parseDouble(reader.nextLine());

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("%.1f in celsius is %.1f °C\n", fahrenheit, celsius);
    }
}
