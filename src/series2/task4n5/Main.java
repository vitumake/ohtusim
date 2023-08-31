package series2.task4n5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int numEvents = 10;
        EventList eventQueue = new EventList();

        for(int i=0; i<numEvents; i++) {
            eventQueue.addEvent(new Event((int)(Math.random()*60)+1, Math.random()>0.5?EventType.ARRIVAL:EventType.DEPARTING));
        }

        eventQueue.getNext();
        Object[] eventArr = eventQueue.getArray();
        Arrays.sort(eventArr);
        for(Object e: eventArr) {
            System.out.println("Event time: "+((Event)e).getEventTime()+"\n"+"Event type: " + ((Event)e).getEventType());
        }
    }
}
