package OopsBasics;

public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	
	MyTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		if(hour<=23 && hour>=0) 
			this.hour = hour;
		else 
			throw new IllegalArgumentException(hour + " Not in range");
		
		if(minute <= 59 && minute>=0 )
			this.minute = minute;
		else
			throw new IllegalArgumentException(minute + " Not in range");
		
		if(second <= 59 && second >= 0)
			this.second = second;
		else
			throw new IllegalArgumentException(second + " Not in range");
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour <= 23 && hour >= 0)
			this.hour = hour;
		else 
			throw new IllegalArgumentException(hour + " Not in range");
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute <= 59 && minute >= 0)
			this.minute = minute;
		else
			throw new IllegalArgumentException(minute + " Not in range");
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second <= 59 && second >= 0)
			this.second = second;
		else 
			throw new IllegalArgumentException(second + " Not in range");
	}
	
	@Override
	public String toString() {
		String time = "";
		time += hour<10 ? "0" + this.hour  + ":" : hour + ":";
		time += minute<10 ? "0" + this.minute  + ":" : minute + ":";
		time += second<10 ? "0" + second : second;
		
		
		return time;
	}
	
	public MyTime nextSecond() {
		if(this.second < 59)
			this.second++;
		else
			this.second = 0;
		return this;
	}
	
	public MyTime nextHour() {
		if(this.hour < 23)
			this.hour++;
		else
			this.hour = 0;
		return this;
	}
	
	public MyTime nextMinute() {
		if(this.minute < 59)
			this.minute++;
		else
			this.minute = 0;
		return this;
	}
	
	public MyTime previousSecond() {
		if(this.second > 0)
			this.second--;
		else
			this.second = 59;
		return this;
	}
	
	public MyTime previousHour() {
		if(this.hour > 0)
			this.hour--;
		else
			this.hour = 23;
		return this;
	}
	
	public MyTime previousMinute() {
		if(this.minute > 0)
			this.minute--;
		else
			this.minute = 59;
		return this;
	}
}
