package com.Management.Travel;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FlightBooking extends TravelFilters implements Booking
{
	@Id
    private int confNum;
	public int getConfNum() {
		return confNum;
	}
	public void setConfNum(int confNum) {
		this.confNum = confNum;
	}
	
	String passengerName;
	String foodPref;
	int age;
	String specialAcc;
	String flightNum;
	String totalCost;
	
	String taxiPref;

	
	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getTaxiPref() {
		return taxiPref;
	}

	public void setTaxiPref(String taxiPref) {
		this.taxiPref = taxiPref;
	}
	
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	
	public void setSpecialAcc(String specialAcc) {
		this.specialAcc = specialAcc;
	}
	public void setPassengerName(String _passengerName)
    {
   	 this.passengerName=_passengerName;
    } 
    public void setFoodPref(String _foodPref)
    {
   	 this.foodPref=_foodPref;
    } 
    public void setAge(int _age)
    {
    	this.age=_age;
    }

    public void setflightNum(String _flightNum)
    {
   	 this.flightNum=_flightNum;
    } 
    
	public String getPassengerName()
    {
   	 return this.passengerName;
    } 
    public String getFoodPref()
    {
   	 return this.foodPref;
    } 
    
    public int getAge()
    {
    	return this.age;
    }
    public String getSpecialAcc()
    {
    	return this.specialAcc;
    }
    public String getflightNum()
    {
   	 return this.flightNum;
    } 
    
    void enterPersonalDetails()
    {
    	Scanner UserInput = new Scanner(System.in);
    	this.setConfNum(144);
    	System.out.println("Enter Personal Details");
		System.out.println("Passenger Name :");
		String myPassenger = UserInput.nextLine();
		this.setPassengerName(myPassenger);
		System.out.println("Food Preference :");
		String myfoodpref = UserInput.nextLine();
		this.setFoodPreference(myfoodpref);
		System.out.println("Age :");
		int myAge = UserInput.nextInt();
		this.setAge(myAge);
		if(this.getAge() > 50)
		{
			System.out.println("Would you need any special any special accomodation?"
					+ "\ny or n :");
			String myspAcc = UserInput.nextLine();
			if(myspAcc.equals("y")){
					this.setSpecialAcc("yes");
					}
		else
		{
			this.setSpecialAcc("no");
		}
			
		}
		System.out.println("Would you need a taxi? y/n: ");
		String myTaxi = UserInput.nextLine();
		if(myTaxi.equals("y"))
		{
			this.setTaxiPref("yes");
		}
		else
		{
			this.setTaxiPref("no");
		}
		
		this.setTotalCost("1210");
		
		

    }
	void makeFlightSelection(String _flightNum)
	{ 
		Scanner UserInput = new Scanner(System.in);
		System.out.println("\nEnter the number against your choice: ");
		int mySelection = UserInput.nextInt();
		this.flightNum=_flightNum;
	}
	void setFoodPreference(String _foodPref )
	{
		this.foodPref=_foodPref;
	}
	void optSpecialAcc(String _splAcc)
	{
		this.specialAcc=_splAcc;
	}
	public void displayConfirmation()
	{
		System.out.printf("Congratulations! Your booking is now complete. \n"
				+ "Your confirmation number is %d", this.getConfNum());
					
	}

	
	
}
