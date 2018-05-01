package com.Management.Travel;

/**
 * Class checks for availability of rooms in a hotel.
 * It prints a list of the available hotels and the price of each room for the customer 
 * to select on the console
 */

/**
 * @author prajnya
 *
 */

public class HotelVendor extends HotelBasicDetails implements Vendor {
	
	public int numVacancies;
	
	public int checkAvailability() {
		// Method to check the database for availability of rooms in the hotel
		this.numVacancies = 0;
		return this.numVacancies;
	}

	public void displayOptions() {
		String display_string = "Select a hotel by typing a number from the list provided: "
				+ "\n\tHotel\tPrice"
				+ "\n 1\tRamada\t$107";
		System.out.println(display_string);
		
	}
	
	public void add(Vendor _VendorOb) {		
		System.out.println("Pushes object to the particular entry in the database");
	}
	
	/** Flight vendor can delete flight routes from the database.*/
	public void removes(Vendor _VendorOb) {
		System.out.println("removes the entry from the database");
	}
	
	public int getNumVacancies(){
		// May have to delete this method. 
		// looks like a duplicate of checkAvailability.
		return 1;
	}

	public void remove(Vendor _VendorOb) {
		// TODO Auto-generated method stub
		
	}

}
