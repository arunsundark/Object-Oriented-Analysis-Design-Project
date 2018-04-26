import java.util.Scanner;


public class FlightBooking extends FlightBasicDetails implements Booking
{
	String passengerName;
	String foodPref;
	int age;
	boolean specialAcc;
	String flightNum;
	String cost;
	String confNum;
	
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getConfNum() {
		return confNum;
	}
	public void setConfNum(String confNum) {
		this.confNum = confNum;
	}
	public void setSpecialAcc(boolean specialAcc) {
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
    public void setSpeaicalAcc(boolean _splAcc)
    {
    	this.specialAcc=_splAcc;
    }
    public void setflightNum(String _flightNum)
    {
   	 this.flightNum=_flightNum;
    } 
    public void setCost(String _cost)
    {
   	 this.cost=_cost;
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
    public boolean getSpecialAcc()
    {
    	return this.specialAcc;
    }
    public String getflightNum()
    {
   	 return this.flightNum;
    } 
    public String getCost()
    {
   	 return this.cost;
    } 
    
    void enterPersonalDetails()
    {
    	Scanner UserInput = new Scanner(System.in);
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
    }
	void makeFlightSelection(String _flightNum)
	{ 
		//TODO: Get options from database and display for selection
		this.flightNum=_flightNum;
	}
	void setFoodPreference(String _foodPref )
	{
		this.foodPref=_foodPref;
	}
	void optSpecialAcc(boolean _splAcc)
	{
		this.specialAcc=_splAcc;
	}
	public void displayConfirmation()
	{
		System.out.println("Congratulations! Your booking is now complete. \n"
				+ "Your confirmation number is 007");
					
	}

	
	
}
