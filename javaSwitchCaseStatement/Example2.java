package com.javaSwitchCaseStatement;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{

		String day;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a day:");		
		
		day = scanner.next().toLowerCase();
		
		scanner.close();
		
		String output = switch(day)
		
		{
			case "monday", "tuesday", "wednesday", "thursday", "friday" -> "weekday";
			
			case "saturday", "sunday"      -> "weekend";
			
			default -> "enter a valid day";
			
		};
		
		System.out.println(output);

	}

}

