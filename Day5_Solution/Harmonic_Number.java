package harmonic_Number;

import java.util.Scanner;

public class Harmonic_Number {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Harmonic Number Program");	
		
		// Local Variable
		int number;
		float result=0.0f;
		// Input from USER
		System.out.println("Enter the Number: ");
		Scanner Var = new Scanner(System.in);
		number = Var.nextInt();
		Var.close();
		if(number!=0)
		{
			for(int i=1; i<=number;i++)
			{
				result +=1/(float)i;
				System.out.print(" "+result);
			}
			
			System.out.println("\n The Harmonic number-- "+result);
		}
		else
		{
			System.out.println("Enter Non Zero value!");
		}
	}
}
