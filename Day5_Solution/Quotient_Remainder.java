package quotient_Remainder;

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		System.out.println("Welcome to Quotient Remainder Program");
		
		// Input from USER
		  int divider, divisor;
	      Scanner var = new Scanner(System.in);
	      System.out.println("Enter an number for Divider : ");
	      divider = var.nextInt();
	      System.out.println("Enter an number for Divisor : ");
	      divisor = var.nextInt();
	      var.close();
	      
	      int result = 0;
	      int quotient, Rem;
	     
	      result = (divider / divisor);
	      quotient = result;
	      System.out.println("Quotient is: "+quotient );
	      result = divider % divisor;
	      Rem = result;
	      System.out.println("Remainder is: "+Rem );
	}

}
