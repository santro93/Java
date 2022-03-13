package even_odd;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		System.out.println("Welcome to find number is Even or odd Program");

			int num;
			
			//get user input
			System.out.println("Enter an number : ");
			Scanner var = new Scanner(System.in);
			num = var.nextInt();
				var.close();
				
			//check num is even or odd
			if( (num % 2) == 0 ) {
				System.out.println(num + " is Even number");
			}
			else {
				System.out.println(num + " is Odd number");	
			}
		
		
	}

}
