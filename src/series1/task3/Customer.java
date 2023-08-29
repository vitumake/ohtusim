package series1.task3;

public class Customer {

    private static int count = 0;
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        endTime = System.currentTimeMillis();
    }

    public long getTimeServed() {
        return endTime-startTime;
    }

    // Main for testing
    public static void main(String[] args) throws InterruptedException {
        Customer user1 = new Customer();
        Customer user2 = new Customer();
        
        System.out.println(user1.getId());
        System.out.println(user2.getId());
        
        user2.setStartTime();
        Thread.sleep(5000);
        user2.setEndTime();

        System.out.println(user2.getTimeServed());

    }

}
