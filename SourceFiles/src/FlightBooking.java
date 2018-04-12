import java.util.Scanner;


public class FlightBooking extends FlightBasicDetails implements Booking
{
	String passengerName;
	String foodPref;
	int age;
	boolean specialAcc;
	String flightNum;
	String cost;
	
	
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
		UserInput.close();
    }
	void makeFlightSelection(String _flightNum)
	{
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
		System.out.println("Ticket confirmed. Confirmation email will be sent");
					
	}

	
	
}
