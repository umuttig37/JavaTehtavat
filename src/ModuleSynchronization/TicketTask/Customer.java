package ModuleSynchronization.TicketTask;
class Customer implements Runnable {
    private static int customerCounter = 1;
    private final TicketTask TicketMaster;
    private final int customerId;
    private final int seatsToBook;
    private final static int MAX_SEATS = 5;

    public Customer(TicketTask theater) {
        this.TicketMaster = theater;
        this.customerId = customerCounter++;
        this.seatsToBook = (int) (Math.random() * MAX_SEATS) + 1;
    }

    @Override
    public void run() {
        TicketMaster.reserveSeats(seatsToBook, customerId);
    }
}
