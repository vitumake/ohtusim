package series3;

public class Main {
    public static void main(String[] args) {
        Clock clkc = Clock.getInstance();
        EventList events = new EventList();
        ServicePoint service = new ServicePoint();
        ArrivalProcess arrivals = ArrivalProcess.getInstance();

        Event event; 
        Customer customer;

        // Gen events
        for(int i=0; i<10; i++) {
            event = arrivals.genEvents(events);
            clkc.setTime(event.getTime());
            System.out.println("Event added. Time: "+clkc.getTime());
        }

        // Run sim
        for(int i=0; i<events.getLength(); i++) {
            event = events.getNext();
            customer = new Customer();
            customer.setStartTime(event.getTime()*1000); // All logic handeled in milliseconds
            service.customerAdd(customer);
        }
        clkc.incTime(5);
        System.out.println("Starting service. Time: "+clkc.getTime());
        service.startService();

    }
}
