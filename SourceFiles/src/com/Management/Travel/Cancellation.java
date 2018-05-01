package com.Management.Travel;
import java.util.Scanner;

public class Cancellation {
	
	private String confNum;
	private String reason;
	private float amtPaid;
	
	public boolean checkConfNum(String _confNum)
	{
		//TODO: Check if the confirmation number is present in the database already.
		/*if _confNum in db:
			return true;
		else:
			return false
		*/
		return false;
	}
	
	public void setConfNum(String _confNum)
	{
		this.confNum = _confNum;
	}
	
	public void getAmtPaid(String _confNum)
	{
		// TODO: Fetch the amount paid by the customer
		// based on the confirmation number.
		this.amtPaid = 30;
	}
	
	public double calculateRefundAmount(CompositeBooking _PdObj)
	{
		double refundAmt = 0.0;
		if(this.reason.equals("Reason"))
		{
			refundAmt = 0.8*(this.amtPaid);
		}
		return refundAmt;
			
	}
	
	public void displayCancellationInfo()
	{
		System.out.printf("The details for the customer with the ID %d is"
				+ "\nFlight info: %d\n"
				+ "Hotel info: %s\n"
				+ "Press y to confirm\n", this.confNum);
	}
	
	public void selectServicesToCancel(int _number)
	{
		// TODO: Decide how the selection and cancellation algorithm works.
	}
	
	public boolean checkTime()
	{
		double remainingTime = 23.30;
		if(remainingTime < 24)
		{
			return false;
		}
		return true;
			
	}
	
	public void enterReasonToCancel()
	{
		// create a scanner so we can read the command-line input
		Scanner reasonScanner = new Scanner(System.in);
		
		//  prompt for the user's reason
		System.out.print("Enter the number against the reason for cancellation: \n"
				+ "1: Medical Reasons"
				+ "2: Family Emergency"
				+ "3: Reschedule"
				+ "4: Other reasons");
		// get their input as a String
		this.reason = reasonScanner.next();
	}
	
	public void cancelReservation(Cancellation _cancelObj)
	{
		//TODO: create a cancellation object
	}

}
