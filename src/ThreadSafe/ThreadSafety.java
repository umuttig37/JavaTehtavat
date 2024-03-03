package ThreadSafe;
public class ThreadSafety {
    public static void main(String[] args) {
        ThreadSafeArrayListManager<String> manager = new ThreadSafeArrayListManager<>();

        Thread addThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                manager.addElement("Element " + i);
            }
        });

        Thread addThread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                manager.addElement("Element " + i);
            }
        });

        Thread removeThread = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                manager.removeElement("Element " + i);
            }
        });

        addThread1.start();
        addThread2.start();
        removeThread.start();

        try {
            addThread1.join();
            addThread2.join();
            removeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of the collection: " + manager.getSize());
    }
}
