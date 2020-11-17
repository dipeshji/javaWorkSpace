package OopsBasics;

public class MyDate {
private int day;
private int month;
private int year;

String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
String[] strDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

public boolean isLeapYear(int year) {
	if(year % 4 == 0 && year % 100 != 0) return true;
	else if(year % 400 == 0) return true;
	else return false;
}

public boolean isValidDate(int year, int month, int day) {
	boolean isLeap = false;
	boolean isValid = false;
	if(year<=9999 && year>0) isLeap = isLeapYear(year);
		if(month > 0 && month < 13)
			if(isLeap && day == 28 || day > 0 && day < 32)
				isValid = true;
	else
		isValid = false;
		
	return isValid;
				
}

public int getDayOfWeek(int year, int month, int day) {
	int centYear = 0;
	if(isValidDate(year,month,day)) {
		int yearFirst2Digits = year % 100;
		switch(yearFirst2Digits % 4) {
		case 1:
			centYear = 4;
			break;
		case 2:
			centYear = 2;
			break;
		case 3:
			centYear = 0;
			break;
		case 0:
			centYear = 6;
			break;
		default:
			centYear = -1;
		}
		centYear += (year / 100);
		centYear += (year / 100)/4;
		if(centYear >= 0) {
			String mont = strMonths[month-1];
			if(isLeapYear(year)) {
				switch(mont) {
				case "Jan":
					centYear += 0;
					break;
				case "Feb":
					centYear += 3;
					break;
				case "Mar":
					centYear += 3;
					break;
				case "Apr":
					centYear += 6;
					break;
				case "May":
					centYear += 1;
					break;
				case "Jun":
					centYear += 4;
					break;
				case "Jul":
					centYear += 6;
					break;
				case "Aug":
					centYear += 2;
					break;
				case "Sep":
					centYear += 5;
					break;
				case "Oct":
					centYear += 0;
					break;
				case "Nov":
					centYear += 3;
					break;
				case "Dec":
					centYear += 5;
					break;
				}
			}else {
				switch(mont) {
				case "Jan":
					centYear += 6;
					break;
				case "Feb":
					centYear += 2;
					break;
				case "Mar":
					centYear += 3;
					break;
				case "Apr":
					centYear += 6;
					break;
				case "May":
					centYear += 1;
					break;
				case "Jun":
					centYear += 4;
					break;
				case "Jul":
					centYear += 6;
					break;
				case "Aug":
					centYear += 2;
					break;
				case "Sep":
					centYear += 5;
					break;
				case "Oct":
					centYear += 0;
					break;
				case "Nov":
					centYear += 3;
					break;
				case "Dec":
					centYear += 5;
					break;
				}
			}
		}
	}
	centYear += day;
	return centYear % 7;
}

MyDate(int year, int month, int day){
	this.year = year;
	this.month = month;
	this.day = day;
}
}
