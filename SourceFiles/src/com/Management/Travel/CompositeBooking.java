package com.Management.Travel;


public class CompositeBooking implements Booking{
	String confNum;
	
	
	public String getConfNum() {
		return confNum;
	}

	public void setConfNum(String confNum) {
		this.confNum = confNum;
	}

	public int makeSelection() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayConfirmation() {
		System.out.printf("\nCongratulations! Your booking is now complete. \n"
				+ "Your confirmation number is %s", this.getConfNum());
		
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
