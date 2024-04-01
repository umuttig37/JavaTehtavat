package LambdaTask.Task2;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollections {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("After filtering out even numbers:");
        System.out.println(numbers);

        numbers.replaceAll(n -> n % 2 != 0 ? n * 2 : n);

        System.out.println("After doubling odd numbers:");
        System.out.println(numbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of the numbers:");
        System.out.println(sum);
    }
}

