package OopsBasics;

public class Date {
	private int day;
	private int month;
	private int year;
	
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year){
		 this.day = day;
		 this.month = month;
		 this.year = year;
	}
	
	@Override
	public String toString(){
		String date = day + "/" + month + "/" + year;
		if(day<10) {
			date = "0" + day;
		}
		if(month<10)
			date = date + "/" + "0" + month + "/" + year;
		
		return date;
	}
}
