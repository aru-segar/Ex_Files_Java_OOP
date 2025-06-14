import java.sql.Timestamp;

public class PasswordChangeEvent implements Event {

    private final Long createdTimeStamp;
    private final String id;

    public PasswordChangeEvent(String id) {
        this.id = id;
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }

    @Override
    public void process() {
        System.out.println("Customer with ID " + id + " has changed their password at " + new Timestamp(createdTimeStamp));
}
