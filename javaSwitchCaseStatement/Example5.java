package com.javaSwitchCaseStatement;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) 
	{

		String month;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a month:");		
		
		month = scanner.next();
		
		scanner.close();
		
		switch(month.toLowerCase())
		{
			case "january":
			System.out.println("......31 days in month......");
			break;
			
			case "february":
			System.out.println("......28/29 days in month.....");
			break;
			
			case "march":
			System.out.println("......31 days in month.....");
			break;
		
			case "april":
			System.out.println("......30 days in month.....");
			break;
			
			case "may":
			System.out.println("......31 days in month.....");
			break;
			
			case "june":
			System.out.println("......30 days in month.....");
			break;
			
			case "july":
			System.out.println("......31 days in month.....");
			break;
			
			case "august":
				System.out.println("......31 days in month.....");
				break;
				
			case "september":
				System.out.println("......30 days in month.....");
				break;
				
			case "october":
				System.out.println("......31 days in month.....");
				break;
				
			case "november":
				System.out.println("......30 days in month.....");
				break;
				
			case "december":
				System.out.println("......31 days in month.....");
				break;
			default:
			System.out.println("enter a valid month");
				
		
		}		

	}

}

