
/*
Written by Arunsundar Kannan

*/


public class VendorFactory {
	
	
	public Vendor getVendor(String _vendorType)
	{
		if(_vendorType=="Flight")
		return (Vendor)new FlightVendor();
		else
		{
			return (Vendor)new HotelVendor();
				
		}
	}

}
