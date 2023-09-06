package series3;

import eduni.distributions.*;

public class ArrivalProcess {
    private Uniform uniVal = new Uniform(1, 10, 21);
    private EventType type = EventType.ARRIVAL;
    private int time;
    private static ArrivalProcess instance = null;

    public static synchronized ArrivalProcess getInstance() {
        if (instance == null) {
            instance = new ArrivalProcess();
        }
        return instance;
    }

    public Event genEvents(EventList list) {
        time+=uniVal.sample();
        return list.addEvent(new Event(time, type));
    }

    public static void main(String[] args) {
        EventList events = new EventList();
        Clock clck = Clock.getInstance();
        ArrivalProcess arrival = ArrivalProcess.getInstance();

        System.out.println(clck.getTime());
        for(int i=0; i<10; i++) {
            clck.setTime(arrival.genEvents(events).getTime());
        }

        for(int i=0;i<10; i++) {
            Event event = events.getNext();
            System.out.println("Type: "+ event.getEventType()+" Event time: "+event.getTime());
        }
        System.out.println(clck.getTime());
    }
}


