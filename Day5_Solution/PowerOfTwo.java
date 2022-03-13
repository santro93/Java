package powerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Welcome to Power Of Two Program ");
		System.out.println("Please Enter Number for Power Of Two : ");
		
		
		int number;
		Scanner Var = new Scanner(System.in);
			 number = Var.nextInt();
		     Var.close();  
		     int result = 0; 
			if(number >= 0 && number <= 31)
			{
				for(int i=1;i<=number;i++)
				{
					result = (int) Math.floor(Math.pow(2,i));
					System.out.print(result + "  ");
				}
			}
			else
			{
				System.out.println("Overflow");
			}
		}
	}