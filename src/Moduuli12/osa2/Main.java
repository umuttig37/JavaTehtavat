package Moduuli12.osa2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 5  ;

        int chunkSize = numbers.length / numThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        SumTask[] tasks = new SumTask[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == numThreads - 1) ? numbers.length : (i + 1) * chunkSize;
            tasks[i] = new SumTask(numbers, startIndex, endIndex);
            executor.execute(tasks[i]);
        }

        executor.shutdown();
        try {
            executor.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = 0;
        for (SumTask task : tasks) {
            totalSum += task.getPartialSum();
        }

        System.out.println("Total sum: " + totalSum);
    }
}
