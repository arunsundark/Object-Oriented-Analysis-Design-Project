/**
 * Class checks for availability of rooms in a hotel.
 * It prints a list of the available hotels and the price of each room for the customer 
 * to select on the console
 */

/**
 * @author prajnya
 *
 */

public class HotelVendor extends HotelBasicDetails implements OptionFinder {
	
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
	
	public int getNumVacancies(){
		// May have to delete this method. 
		// looks like a duplicate of checkAvailability.
		return 1;
	}

}
