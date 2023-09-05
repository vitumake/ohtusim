package series3;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
    private int serviceTimes = 0;

    public void customerAdd(Customer customer) {
        customerQueue.addFirst(customer);
    }

    public void customerRm() {
        customerQueue.removeLast();
    }

    public int getTimeServed() {
        return serviceTimes;
    }

    public void startService() {
        while(customerQueue.size()>0) {
            Customer c = customerQueue.getLast();
            c.setEndTime(Clock.getInstance().getTime()*1000);
            System.out.println("Customer id"+c.getId()+" service time: "+c.getTimeServed()/1000 + " seconds");
            serviceTimes += c.getTimeServed();
            this.customerRm();
        }
        System.out.println("Customer queue empty.");
    }
}