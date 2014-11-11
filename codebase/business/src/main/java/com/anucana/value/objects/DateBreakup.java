package com.anucana.value.objects;

import java.util.Calendar;

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
	
	private String hour;
	
	private String minute;
	
	private String amOrPm;
	
	public DateBreakup(int date, int month, int year, int hour,int minute, int amOrPM) {
		super();
		this.date = date;
		this.year = year;
		this.hour = formatForMinimum(hour);
		this.minute = formatForMinimum(minute);
		if(amOrPM == Calendar.AM){
			amOrPm = "AM";
		}else if(amOrPM == Calendar.PM){
			amOrPm = "PM";
		}

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

	private String formatForMinimum(int val) {
		if(val < 10){
			return "0" + val;
		}
		return "" + val;
	}

	public int getDate() {
		return date;
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

	public String getHour() {
		return hour;
	}

	public String getMinute() {
		return minute;
	}

	public String getAmOrPm() {
		return amOrPm;
	}

	
	
}