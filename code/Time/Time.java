package Time;

/**
 * Created by David on 3/21/2016.
 */
public class Time {

    private int hours;
    private int mins;

    public Time(int h, int m) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60) {
            hours = h;
            mins = m;
        } else {
            throw new IllegalArgumentException("Hours or Minutes out bounds error");
        }
    }

    private int toMins() {
        int temp = hours * 60;
        int temp2 = mins + temp;
        return temp2;
    }

    public boolean lessThan(Time t) {
        if (mins < t.toMins()) {
            return true; 
        }else {
            return false;
        }
    }

    public int elapsedSince(Time t) {
        return ((hours * 60 + mins) + (24 * 60)) - t.toMins();
    }

    public String toString() {
        return "The number of hours is: " + hours + " The number of minutes is: " + mins;
    }
}
