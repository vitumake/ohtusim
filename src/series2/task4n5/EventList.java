package series2.task4n5;

import java.util.PriorityQueue;

public class EventList {
    
    PriorityQueue<Event> eventQueue = new PriorityQueue<Event>();

    public void addEvent(Event evnt) {
        eventQueue.add(evnt);
    }

    public Event getNext() {
        return eventQueue.poll();
    }

    public Object[] getArray() {
        return eventQueue.toArray();
    }
}
