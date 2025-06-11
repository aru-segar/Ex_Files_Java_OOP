public class MissedPaymentEvent implements Event {
    private Long createdTimeStamp;
    private String id;

    public MissedPaymentEvent(String id) {
        this.id = id;
        this.createdTimeStamp = System.currentTimeMillis();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }

    @Override
    public void process() {
        System.out.println("Customer with ID " + id + " has missed a payment at " + new Timestamp(createdTimeStamp));
    }
}
