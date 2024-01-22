package Moduuli3;
import java.util.Scanner;
public class Moduuli3osa2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        String binaryNum = reader.nextLine();

        reader.close();

        int decimalResult = 0;

        for (int i = 0; i < binaryNum.length(); i++) {
            char bitChar = binaryNum.charAt(i);

            int bitValue = Character.getNumericValue(bitChar);

            decimalResult = (decimalResult << 1) | bitValue;
        }

        System.out.println("Decimal equivalent: " + decimalResult);
    }
}
