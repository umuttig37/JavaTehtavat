package Moduuli4;

import java.util.Scanner;

public class Moduuli4osa3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("size of the array: ");
        int size = scanner.nextInt();

        System.out.println("integers into the array:");

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }


        int[] resultArray = makeArrayUnique(inputArray);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }

        scanner.close();
    }

    private static int[] makeArrayUnique(int[] inputArray) {
        int uniqueCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (inputArray[i] == inputArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        int[] resultArray = new int[uniqueCount];
        int resultIndex = 0;

        // Copy unique elements to the new array
        for (int i = 0; i < inputArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (inputArray[i] == inputArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                resultArray[resultIndex++] = inputArray[i];
            }
        }

        return resultArray;

    }
}
