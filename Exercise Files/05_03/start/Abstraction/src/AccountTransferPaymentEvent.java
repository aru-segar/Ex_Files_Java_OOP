public class AccountTransferPaymentEvent implements Event {
    private Long createdTimeStamp;
    private String id;

    public AccountTransferPaymentEvent(String id) {
        this.id = id;
        this.createdTimeStamp = System.currentTimeMillis();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }

    @Override
    public void process() {
        System.out.println("Transfer of " + amount + " from account " + sourceAccount + " to account " + destinationAccount + " has been processed at " + new Timestamp(createdTimeStamp));
    }
    
}
