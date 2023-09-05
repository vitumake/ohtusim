package series3;

public class Event implements Comparable<Event>{
    
    private int eventTime;
    private EventType eventType;

    public Event(int time, EventType type) {
        this.eventTime = time;
        this.eventType = type;
    }

    public int getTime() {
        return eventTime;
    }

    public int compareTo(Event evnt) {
        if(eventTime==evnt.eventTime)
            return 0;
        else if(eventTime>evnt.eventTime)
            return 1;
        else
            return -1;
    }

    public EventType getEventType() {
        return eventType;
    }
}
