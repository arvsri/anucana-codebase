package com.anucana.value.objects;

/**
 * Useful for UI display purposes. Plugged in with appropriate setXXXDate() methoods in a value object to provide the date and time breakup on UI
 * 
 * @see {@link Event#setEventDate(String)}
 * 
 */
public class DateBreakup{
	
	private int date;
	
	private String month;
	
	private int year;
	
	private int hour;
	
	private int minute;
	
	public DateBreakup(int date, int month, int year, int hour,int minute) {
		super();
		this.date = date;
		this.year = year;
		this.hour = hour;
		this.minute = minute;

		switch (month){
			case 1:
				setMonth("Jan");
				break;
			case 2:
				setMonth("Feb");
				break;
			case 3: 
				setMonth("Mar");
				break;
			case 4: 
				setMonth("Apr");
				break;
			case 5: 
				setMonth("May");
				break;
			case 6: 
				setMonth("Jun");
				break;
			case 7: 
				setMonth("Jul");
				break;
			case 8: 
				setMonth("Aug");
				break;
			case 9: 
				setMonth("Sep");
				break;
			case 10: 
				setMonth("Oct");
				break;
			case 11: 
				setMonth("Nov");
				break;
			case 12: 
				setMonth("Dec");
				break;
		}
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String string) {
		this.month = string;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
	
	
}