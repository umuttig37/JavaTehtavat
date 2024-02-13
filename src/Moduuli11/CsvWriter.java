package Moduuli11;
import java.io.FileWriter;
import java.io.IOException;
public class CsvWriter {
    public static void main(String[] args) {
        int n = 100;
        long[] fibonacciSequence = new long[n];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;


        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        String csvFile = "fibonacci.csv";
        try (FileWriter writer = new FileWriter(csvFile)) {
            for (int i = 0; i < n; i++) {
                writer.append(String.valueOf(fibonacciSequence[i]));
                writer.append("\n");
            }
            System.out.println("Fibonacci sequence has been written to " + csvFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the CSV file.");
            e.printStackTrace();
        }
    }
}
