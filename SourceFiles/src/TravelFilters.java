import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class TravelFilters extends FlightBasicDetails 
{
	protected boolean roundTrip;
	public void enterTravelDetails()
	{	Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter Travel Details");
		System.out.println("Which city are you traveling from? ");
		String myFrom = UserInput.nextLine();
		this.setFrom(myFrom);
		System.out.println("Enter the destination: ");
		String myTo = UserInput.nextLine();
		this.setTo(myTo);
		System.out.println("Enter date in dd-MM-yyyy format: ");
		String myStringDate = UserInput.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date myDate=null;
		try
		{
			myDate = dateFormat.parse(myStringDate);
		}
		catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		this.setDate(myDate);
		UserInput.close();
	}
	
}
