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
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Overloaded constructor with initial time settings
    public Clock(int hours, int minutes, int seconds) {
        this(); // Call default constructor to set default values
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Getter methods for hours, minutes, and seconds
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Setter method for hours with validation
    public void setHours(int hours) {
        if (hours >= HOURS_LOWER_LIMIT && hours <= HOURS_UPPER_LIMIT) {
            this.hours = hours;
        }
    }

    // Setter method for minutes with validation
    public void setMinutes(int minutes) {
        if (minutes >= MINUTES_LOWER_LIMIT && minutes <= MINUTES_UPPER_LIMIT) {
            this.minutes = minutes;
        }
    }

    // Setter method for seconds with validation
    public void setSeconds(int seconds) {
        if (seconds >= SECONDS_LOWER_LIMIT && seconds <= SECONDS_UPPER_LIMIT) {
            this.seconds = seconds;
        }
    }

    // Override toString to display time in HH:MM:SS format
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Increment time by one second
    public void tick() {
        seconds = (seconds + 1) % 60;
        if (seconds == 0) {
            minutes = (minutes + 1) % 60;
            if (minutes == 0) {
                hours = (hours % HOURS_UPPER_LIMIT) + 1;
            }
        }
    }

    // Increment time by a given number of seconds and print each second
    public void tick(int secondsToIncrement) {
        for (int i = 0; i < secondsToIncrement; i++) {
            tick();
            System.out.println(toString());
        }
    }
}