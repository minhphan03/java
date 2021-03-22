/*
 * Assignment 01 
 * C SCI 143
 * 
 * This class creates an object representing a calendar date 
 */

public class Date 
{
	//Fields for month and day
	private int month;
	private int day;
	
	//Constructor for our Date object
	public Date (int m, int d)
	{
		month = m;
		day = d;
	}
	
	//The getter methods for the Date objects day and month
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	
	//Returns the number of days in the Date objects month
	public int daysInMonth()
	{
		int[] daysList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int result = 0;
		for(int i = 0; i < getMonth(); i++)
		{
			result = daysList[i];
		}
		return result;
	}
	
	/*
	 * Returns the Date object as a String, for example, 
	 * a date object (12, 4) would return 12/4
	 */
	public String toString()
	{
		return month + "/" + day;
	}
	
	/*
	 * Advances the Date object by one day, shifting into different months
	 * as necessary
	 */
	public void nextDay()
	{
		day++;
		if(getDay() >= daysInMonth())
		{
			day = 1;
			month++;
			if(month > 12)
			{
				month = 1;
			}
		}
	}
	
	/*
	 * returns the absolute day of the Date object, for example, the Date(1 , 4)
	 * would return 4, the Date(2, 1) would return 32
	 */
	public int absoluteDay()
	{
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int absDay = 0;
		for(int i = 0; i < month - 1; i++)
		{
			absDay += daysInMonth[i];
		}
		absDay += day;
		return absDay;
	}
	
}
