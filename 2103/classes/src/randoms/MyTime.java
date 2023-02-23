package classes;

public class MyTime {
	private int hour;
    private int minute;
    private int second;
    private String meridian;
    
	public MyTime() {
		this(12, 0, 0, "AM");
	}
	public MyTime(int hour, int minute, int second, String meridian) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.meridian = meridian;
	}
    
	public void displayTime() {
        // System.out.println(String.format("%02d:%02d %s", hour, minute, meridian));
        System.out.println(this);
    }

    public void setHour(int hour) {
        this.hour = (hour <= 12 && hour > 0) ? hour : 12;
    }

    public void setMinute(int minute) {
        this.minute = (minute < 60 && minute > 0) ? minute : 0;
    }

    public void setSecond(int second) {
        this.second = (second < 60 && second > 0) ? second : 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tickBySecond() {
        if (this.second == 59) {
            this.second = 0;
            tickByMinute();
        } else {
            this.second++;
        }
    }

    public void tickByMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            this.second = 0;
            tickByHour();
        } else {
            this.minute++;
        }
    }

    public void tickByHour() {
        if (this.hour == 12) {
            this.hour = 1;
            if (this.meridian.equals("AM")) {
                this.meridian = "PM";
            } else {
                this.meridian = "AM";
            }
        } else {
            this.hour++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%02d:%02d:%02d %s", hour, minute, second, meridian));

        return sb.toString();
    }
}
