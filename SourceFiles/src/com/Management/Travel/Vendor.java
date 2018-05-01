package com.Management.Travel;

/*
Written by Arunsundar Kannan

*/
public interface Vendor {
	int checkAvailability();
	void displayOptions(); 
	void add(Vendor _VendorOb );
	void remove (Vendor _VendorOb ); 
}
