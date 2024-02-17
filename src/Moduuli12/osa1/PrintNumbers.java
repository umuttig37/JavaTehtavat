package Moduuli12.osa1;

    class PrintNumbers implements Runnable {
        private final int start;
        private final int end;
        private final boolean isOdd;

        public PrintNumbers(int start, int end, boolean isOdd) {
            this.start = start;
            this.end = end;
            this.isOdd = isOdd;
        }
        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if ((i % 2 == 0 && !isOdd) || (i % 2 != 0 && isOdd)) {
                    String threadName = isOdd ? "Odd Thread: " : "Even Thread: ";
                    System.out.println(threadName + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }



