package com.Management.Travel;
import java.util.Scanner;


public class FlightOperator {
	
	private Scanner UserInput;
	
	public FlightOperator()
	{
		this.UserInput = scan();
	}
	
	public Scanner scan()
	{
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	public void performOperations()
	{
		System.out.println("Type 1 if you want to add a flight"
				+ "\n2. if you want to delete a flight route: ");
		int operationType = UserInput.nextInt();
		FlightVendor operations = new FlightVendor();

		if(operationType==1)
		{
			// TODO: Create a vendor object
		}
		
	}

}
