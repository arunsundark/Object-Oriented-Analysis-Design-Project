/**
 * @author ashish
 *
 */
import java.util.*;

public abstract class HotelBasicDetails {
	protected String location;
	protected String hotelName;
	protected Date date;
	protected int price;
	protected int numDays;
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation (String _location) {
		location= _location;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName (String _hotelName) {
		hotelName= _hotelName;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate (Date _date) {
		date= _date;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setprice (int _price) {
		price= _price;
	}
	
	public int getNumDays() {
		return numDays;
	}
	
	public void setNumDays (int _numDays) {
		numDays= _numDays;
	}

}
