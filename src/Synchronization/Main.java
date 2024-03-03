package Synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        final int TOTAL_SEATS = 20;
        final int TOTAL_CUSTOMERS = 15;

        TicketTask theater = new TicketTask(TOTAL_SEATS);
        ExecutorService executorService = Executors.newFixedThreadPool(TOTAL_CUSTOMERS);

        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            executorService.execute(new Customer(theater));
        }

        executorService.shutdown();
    }
}
