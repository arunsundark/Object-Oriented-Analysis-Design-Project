/**
 * Interface that is used to check availability and display the options available to the customer.
 * It is used for any methods that check the database for info about the options
 */

/**
 * @author prajnya
 *
 */
interface OptionFinder {
	int checkAvailability();
	void displayOptions();
}
