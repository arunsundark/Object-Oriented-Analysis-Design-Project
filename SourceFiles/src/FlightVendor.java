/**
 * Class is used as a point of contact between the vendor who controls the flight routes,
 * the database and the admin who makes decisions of whether to remove flights or not.
 */

/**
 * @author prajnya
 *
 */


public class FlightVendor extends FlightBasicDetails  {

	private String flightNum;
	private int cost;
	private int numSeats;
	
	public int checkAvailability() {
		// TODO: Access from DB.
		this.numSeats = 25;
		return this.numSeats;
	}
	
	/** Displays all possible flight options with source, destination, airline and cost
	* on the console.
	* Asks the customer to pick on by typing in the number against the entry. 
	 * @return */
	public String displayOptions() {
		String displayString = "These are your fight options. Enter the number against the options: "
				+ "\n\tSource\tDestination\tAirline\tCost"
				+ "\n1.\tDelhi\tDenver\tUnited\t$1084";
		System.out.println(displayString);
		//TODO: set the flight num by setting the flightNum variable based on the option selected.
		this.flightNum = "DENDELAI01";
		return this.flightNum;
	}
	
	/** Allows the flight vendor like United or AirIndia to add more flight routes and
	 * Other corresponding information into the database.*/
	public void add(Vendor _VendorOb) {		
		System.out.println("Pushes objrct to the particular entry in the database");
	}
	
	/** Flight vendor can delete flight routes from the database.*/
	public void removes(Vendor _VendorOb) {
		System.out.println("removes the entry from the database");
	}

	/** When a flight vendor decides to delete the flight, he need to ask approval from 
	 * the system to do so. 
	 * The system must confirm that there are no current bookings for the flight route marked for
	 * deletion.
	 * */
	public void requestApproval() {
		
		//TODO:
	}
	

}
