package series1.task5n6;

import java.util.LinkedList;
import series1.task3.Customer;

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

    public void startService() throws InterruptedException {
        while(customerQueue.size()>0) {
            Customer c = customerQueue.getLast();
            c.setStartTime();
            Thread.sleep(((long)(Math.random()*8)+1)*1000);
            c.setEndTime();
            System.out.println("Customer id"+c.getId()+" service time: "+c.getTimeServed()/1000 + " seconds");
            serviceTimes += c.getTimeServed();
            this.customerRm();
        }
        System.out.println("Customer queue empty.");
    }
}