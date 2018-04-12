/**
 * @author ashish
 *
 */

import java.util.*;


public class HotelBooking extends HotelBasicDetails implements Booking {
	private String customerId;
	
	public String getCustomerId() {
		return customerId;
	}
	
	public int makeHotelSelection(HotelBooking[] list) {
		int choice=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please make your selection from the options below: (0 to cancel)");
		for (int i=0; i<list.length; i++) {
			System.out.println(Integer.toString(i+1) + "\t" +list[i].hotelName + "\t" + list[i].location + "\t" + Integer.toString(list[i].price));
		}
		choice=sc.nextInt();
		return choice;
	}
	
	public void displayConfirmation() {
		System.out.println("Your Hotel Booking is confirmed");
		System.out.println("Customer ID: "+ customerId);
		System.out.println("Hotel: "+ hotelName);
		System.out.println("Location: "+ location);
		System.out.println("Booking date: "+ date.toString());
		System.out.println("Booked for " + Integer.toString(numDays));
		System.out.println("Total price: " + Integer.toString(price));
	}
}
