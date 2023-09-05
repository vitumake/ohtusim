package series3;


public class Clock {
    private int time;
    private static Clock instance = null;

    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public int setTime(int val) {
        time=val;
        return time;
    }

    public int incTime(int val) {
        time+=val;
        return time;
    }

    public int getTime() {
        return time;
    }
}
