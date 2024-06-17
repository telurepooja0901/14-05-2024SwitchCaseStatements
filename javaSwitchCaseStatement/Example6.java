package com.javaSwitchCaseStatement;

import java.util.Scanner;

public class Example6 
{

	public static void main(String[] args) 
	{

		String month;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a month:");		
		
		month = scanner.next().toLowerCase();
		
		scanner.close();
		
		String output = switch(month)
				
		{
			case "january", "march", "may", "july", "august", "october", "december" -> ".....31 days in a month.....";
			
			case "february" -> ".....29 days in a month.....";
			
			case "april", "june", "september", "november" -> ".....30 days in a month.....";
			
			default -> "enter a valid month";
			
		};
			
				
		System.out.println(output);
					

	}

}

