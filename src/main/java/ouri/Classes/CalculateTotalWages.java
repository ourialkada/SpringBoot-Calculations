package ouri.Classes;

public class CalculateTotalWages {
	public float hoursWorked;
	public float hourlyWage;
	public float weeklyPay;
	
	
	public CalculateTotalWages(float hourlyWage, float hoursWorked,float weeklyPay) {
		super();
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
		this.weeklyPay=weeklyPay;
	}
	
	
	public CalculateTotalWages()
	{
		
	}


	public float getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public float getHourlyWage() {
		return hourlyWage;
	}


	public void setHourlyWage(float hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


	public float getWeeklyPay() {
		return weeklyPay;
	}


	public void setWeeklyPay(float weeklyPay) {
		this.weeklyPay = weeklyPay;
	}
	
	
}
