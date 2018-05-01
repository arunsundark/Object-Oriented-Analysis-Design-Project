package com.Management.Travel;


import org.hibernate.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;



/*
Written by Arunsundar Kannan

*/
public class Driver
{
    public static void main(String[] args) throws Exception
    {
    	Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter"
				+ "\n 1. if you are a traveler"
				+ "\n 2. if you are an airline operator"
				+ "\n 3. if you are a hotel admin:");
		int userType = UserInput.nextInt();
		if(userType==1)
		{
			
			//Session session = HibernateUtil.getSessionFactory().openSession();
			//session.beginTransaction();
			
			NewUser traveler = new NewUser();
			traveler.getOperationType();
        
			//FlightBooking customer = new FlightBooking();
			//session.save(traveler);
			//session.getTransaction().commit();
		}
		if(userType==2)
		{
			NewUser operator = new NewUser();
			//operator.performOperations();
			
			
		}
    }
    
    
}

