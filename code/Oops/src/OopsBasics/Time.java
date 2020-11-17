package OopsBasics;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hours, int minute, int second){
		this.hour = hours;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		String time = hour + ":" + minute + ":" + second;
		if(hour<10)
			time = "0" + hour + ":" + minute + ":" + second;
		if(minute<10)
			time = hour + ":" + "0" + minute + ":" + second;
		if(second<10)
			time = hour + ":" + minute + ":" + "0" + second;
			
		return time;
	}
	
	public String nextSecond() {
		second++;
		return toString();
	}
	
	public String previousSecond() {
		second-=2;
		return toString();
	}
}
