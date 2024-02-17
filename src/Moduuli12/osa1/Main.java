package Moduuli12.osa1;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        Thread oddThread = new Thread(new PrintNumbers(start, end, true));
        Thread evenThread = new Thread(new PrintNumbers(start, end, false));

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing complete.");
    }
}
