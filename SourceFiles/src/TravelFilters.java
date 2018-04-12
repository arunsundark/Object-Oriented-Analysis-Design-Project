





/*
Written Arunsundar Kannan

*/






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
		System.out.println("From :");
		String myFrom = UserInput.nextLine();
		this.setFrom(myFrom);
		System.out.println("To :");
		String myTo = UserInput.nextLine();
		this.setTo(myTo);
		System.out.println("Date :");
		String myStringDate = UserInput.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
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
