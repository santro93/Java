package max_MinNumber;

import java.util.Scanner;

public class Max_MinNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Find the Largest Among Three Numbers Program");
		
		int Num1, Num2, Num3;
		Scanner Var = new Scanner (System.in);
		System.out.println("Please Enter 1st Number: ");
		Num1 = Var.nextInt();
		
		System.out.println("Please Enter 2nd Number: ");
		Num2 = Var.nextInt();
		
		System.out.println("Please Enter 3rd Number: ");
		Num3 = Var.nextInt();
			Var.close();
			
		//use ternary operator to find max 
		//result = (Num1 > Num2) ? Num1 : Num2;
	        
	   // result = (result > Num3) ? result : Num3;
		if( Num1 > Num2 && Num1 > Num3){
		      System.out.println("The largest number is " +Num1);
			} 
		else if (Num2 > Num1 && Num2 > Num3) {
		         System.out.println("The largest number is " +Num2);
			}
		else {
		         System.out.println("The largest number is " +Num3);
	       }
	}
}

