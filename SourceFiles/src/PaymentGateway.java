import java.util.Scanner;


public class PaymentGateway {
	
	public String customerName;
	public int cardNumber;
	
	public void debitAmtToCustomer(float _payment)
	{
		// create a scanner so we can read the command-line input
		Scanner paymentScanner = new Scanner(System.in);

	    //  prompt for the user's name
	    System.out.print("Enter the name on your credit card: ");
	    // get their input as a String
	    customerName = paymentScanner.next();

	    // prompt for their card number
	    System.out.print("Enter your credit-card number: ");
	    // get the card number as an integer
	    cardNumber = paymentScanner.nextInt();
	    
	    paymentScanner.close();
	    
	    //TODO: Need to store the payment amount in the database.
	}
	
	public void creditAmtToCustomer(float _payment)
	{
		//TODO: Fetch the amount from the database and remove the 
		// amount against the customer name.
		System.out.printf("An amount of $%f will be credited to your account", _payment);

	}
	
}
