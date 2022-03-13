package leap_Year;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		System.out.println("Welcome to Leap Year Program");	
		int year,digit = 0;
		System.out.println("Enter the year: ");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		scanner.close();
		int temp=year;
		while(temp!=0)
		{		
			temp/=10;
			++digit;
		}
		if(digit == 4)
		{
			if(year % 400 == 0 && year % 100 != 0 || year % 4 == 0)
			{
				System.out.println("Year is a leap year");
			}
			else
			{
				
				System.out.println("Year is not a leap year");
			}
		}
		else
		{
			System.out.println("Please Enter 4 digit Year!");
		}
	}

}
