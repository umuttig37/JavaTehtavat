package Moduuli12.osa2;



class SumTask implements Runnable {
    private final int[] array;
    private final int startIndex;
    private final int endIndex;
    private long partialSum;

    public SumTask(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;
    }

    public long getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }
    }
}
