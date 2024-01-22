package Moduuli4;
import java.util.Scanner;
public class Moduuli4osa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the integers:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            currentSum += array[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                endIndex = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                startIndex = i + 1;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Subarray Indices (starting from 1): " + (startIndex + 1) + " to " + (endIndex + 1));

        scanner.close();
    }
}
