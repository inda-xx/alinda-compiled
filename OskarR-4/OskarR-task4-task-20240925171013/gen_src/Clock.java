import java.util.Set;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private static final int HOURS_LOWER_LIMIT = 1;
    private static final int HOURS_UPPER_LIMIT = 12;
    private static final int MINUTES_LOWER_LIMIT = 0;
    private static final int MINUTES_UPPER_LIMIT = 59;
    private static final int SECONDS_LOWER_LIMIT = 0;
    private static final int SECONDS_UPPER_LIMIT = 59;

    // Default constructor sets the clock to 12:00:00
    public Clock() {
        // TODO: Implement this constructor.
    }

    // Overloaded constructor with initial time settings
    public Clock(int hours, int minutes, int seconds) {
        // TODO: Implement this constructor.
    }

    // Getter methods for hours, minutes, and seconds
    public int getHours() {
        // TODO: Implement this method.
    }

    public int getMinutes() {
        // TODO: Implement this method.
    }

    public int getSeconds() {
        // TODO: Implement this method.
    }

    // Setter method for hours with validation
    public void setHours(int hours) {
        // TODO: Implement this method.
    }

    // Setter method for minutes with validation
    public void setMinutes(int minutes) {
        // TODO: Implement this method.
    }

    // Setter method for seconds with validation
    public void setSeconds(int seconds) {
        // TODO: Implement this method.
    }

    // Override toString to display time in HH:MM:SS format
    @Override
    public String toString() {
        // TODO: Implement this method.
    }

    // Increment time by one second
    public void tick() {
        // TODO: Implement this method.
    }

    // Increment time by a given number of seconds and print each second
    public void tick(int secondsToIncrement) {
        // TODO: Implement this method.
    }
}