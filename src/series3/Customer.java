package series3;

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

    public void setStartTime(int val) {
        startTime = val;
    }

    public void setEndTime(int val) {
        endTime = val;
    }

    public long getTimeServed() {
        return endTime-startTime;
    }
}
