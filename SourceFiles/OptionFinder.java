/**
 * This the interface to find availability of products and display those which are available.
 * Any class that searches the database of flights or hotels inherits from this interface.
 */

/**
 * @author prajnya
 *
 */
interface OptionFinder {
	
	int checkAvailability();
	void displayOptions();
	
}
