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
}


