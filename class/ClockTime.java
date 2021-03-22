/*
 * Assignment 01
 * C SCI 143
 * 
 * This class creates an object that represents a time 
 * A Class representing a 12-hour time clock.
 * 
 */


public class ClockTime 
{
	//Fields for hour, minute, and AM/PM
	private int hour;
	private int minute;
	private String amPm;
	
//constructor for ClockTime object
	public ClockTime(int h, int m, String ap)  
	{
		hour = h;
		minute = m;
		amPm = ap;
	}
	
	// Getters for minute and hour
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	/*
	 * Returns the ClockTime object as a String, for example, ClockTime(10, 39, "PM")
	 * would return "10:39 PM"
	 */
	public String toString()
	{
		String print;
		if(minute < 10)
		{
			print = hour + ":" + 0 + minute + " " + amPm;
		}
		else 
		{
			print = hour + ":" + minute + " " + amPm;
		}
		return print;
	}
	
	/*
	 * The while loop inside advances the time, changing hours
	 * and "AM" or "PM" status as needed
	 * 
	 */
	public void advance(int addMinutes)  
	{
		while(addMinutes > 0)
		{
			minute += 1;
			if(minute >= 60)
			{
				minute = 00;
				hour += 1;
			}
			
			if(hour == 12 && minute == 0)
			{
				if(amPm == "PM")
				{
					amPm = "AM";
				}
				else
				{
					amPm = "PM";
				}
			}
			//12-hour time wrap around

			if(hour > 12)
			{
				hour = 1;
			}
			addMinutes -= 1;
		}
	}
}
