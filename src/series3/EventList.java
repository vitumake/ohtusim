package series3;

import java.util.PriorityQueue;

public class EventList {
    
    PriorityQueue<Event> eventQueue = new PriorityQueue<Event>();

    public Event addEvent(Event evnt) {
        eventQueue.add(evnt);
        return evnt;
    }

    public Event getNext() {
        return eventQueue.poll();
    }

    public int getLength() {
        return eventQueue.size();
    }
}
