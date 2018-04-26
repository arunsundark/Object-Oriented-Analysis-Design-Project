import java.util.Scanner;



/*
Written by Arunsundar Kannan

*/


public class DriverClass {

	
	public static void main(String args[])
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter 1. if you are a traveler"
				+ " 2. if you are an airline operator"
				+ "3. if you are a hotel admin:");
		int userType = UserInput.nextInt();
		if(userType==1)
		{
			NewUser traveler = new NewUser();
			traveler.getOperationType();
		}
		if(userType==2)
		{
			FlightOperator newOperator = new FlightOperator();
			newOperator.performOperations();
		}

	}
}
