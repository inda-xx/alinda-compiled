public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    // Define getter methods
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours >= 1 && hours <= 12) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        }

    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        }

    }

    // Constructor without parameters
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Overloaded constructor
    public Clock(int hours, int minutes, int seconds) {
        this(); // Call default constructor
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public void addSecond() {
        seconds = (seconds + 1) % 60;
        if (seconds == 0) {
            minutes = (minutes + 1) % 60;
            if (minutes == 0) {
                hours = (hours % 12) + 1;
            }
        }
    }

    public void tick(int seconds) {
        for (int i = 0; i < seconds; i++) {
            addSecond();
            System.out.println(toString());
        }
     }

}
