package Functional.Task1;

import java.util.Arrays;

public class MeanCalculator {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        double mean = Arrays.stream(numbers).average().orElse(Double.NaN);

        System.out.println("The mean is: " + mean);
    }
}
