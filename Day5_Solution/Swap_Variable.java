package swap_Variable;

import java.util.Scanner;

public class Swap_Variable {

	public static void main(String[] args) {
		System.out.println("Welcome to Swap Two Numbers");
		
		
		int x ,y ;
		Scanner var = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		 x = var.nextInt();
		System.out.println("Enter 2nd number: ");
		 y = var.nextInt();
		   var.close();
		int temp;
		temp = y;
		y = x;
		x = temp;
		System.out.println("Swapped Numbers are x = "+x +"  y = " +y);
	}

}
