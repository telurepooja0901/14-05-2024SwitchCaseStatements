package com.javaSwitchCaseStatement;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{

		String day;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a day:");		
		
		day = scanner.next();
		
		scanner.close();
		
		switch(day.toLowerCase())
		{
			case "monday":
			System.out.println("......weekday.....");
			break;
			
			case "tuesday":
			System.out.println("......weekday.....");
			break;
			
			case "wednesday":
			System.out.println("......weekday.....");
			break;
		
			case "thursday":
			System.out.println("......weekday.....");
			break;
			
			case "friday":
			System.out.println("......weekday.....");
			break;
			
			case "saturday":
			System.out.println("......weekdend....");
			break;
			
			case "sunday":
			System.out.println("......weekdend....");
			break;
			
			default:
			System.out.println("enter a valid day");
				
		
		}		

	}

}

