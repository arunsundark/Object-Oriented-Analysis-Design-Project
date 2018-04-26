import java.util.Scanner;


public class NewUser {
	
	public NewUser() {};
	
	public void getOperationType()
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter 1. for a new booking and 2. to cancel a reservation: ");
		int operationType = UserInput.nextInt();

		if(operationType==1)
		{
			this.newBooking();
		}
		else if(operationType==2)
		{
			this.cancelBooking();
		}

	}	
	
	private void newBooking()
	{
		FlightBooking personalDetails = new FlightBooking();
		personalDetails.enterPersonalDetails();
		TravelFilters travelInfo = new TravelFilters();
		travelInfo.enterTravelDetails();
		FlightVendor sysAdmin = new FlightVendor();
		sysAdmin.checkAvailability();
		String _flightNum = sysAdmin.displayOptions();
		personalDetails.makeFlightSelection(_flightNum);
		// TODO: How is the composite booking implemented?? No clue what's going on in there
		personalDetails.displayConfirmation();
	}
	
	private void cancelBooking()
	{
		
	}

}
