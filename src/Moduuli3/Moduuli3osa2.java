package Moduuli3;
import java.util.Scanner;
public class Moduuli3osa2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Initialize the decimal result to 0
        int decimalResult = 0;

        // Iterate through each character in the binary string
        for (int i = 0; i < binaryInput.length(); i++) {
            // Get the character at the current position
            char bitChar = binaryInput.charAt(i);

            // Convert the character to its numeric value (0 or 1)
            int bitValue = Character.getNumericValue(bitChar);

            // Update the decimal result by shifting and adding the current bit value
            decimalResult = (decimalResult << 1) | bitValue;
        }

        // Display the decimal equivalent
        System.out.println("Decimal equivalent: " + decimalResult);
    }
}
