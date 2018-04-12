
public class CompositeBooking implements Booking{

	@Override
	public int makeSelection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayConfirmation() {
		System.out.println("Congratulations! Your booking is now complete. \n"
				+ "Your confirmation number is 007");
		
	}
	
	public void add(Booking _booking)
	{
		System.out.println("A new booking is added to the database");
	}
	
	public void cancel(Booking _booking)
	{
		System.out.println("The booking is cancelled for the database");
	}
	
	public void initiatePayment(float _payment, PaymentGateway _paymentObj)
	{
		System.out.println("Refund issued");
	}
	
	
}
