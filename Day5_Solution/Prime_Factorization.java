package prime_factorization;

import java.util.Scanner;

public class Prime_Factorization {

	public static void main(String[] args) {
		System.out.println("Welcome to Prime Factorization ");
		System.out.println("Please Enter Number for Prime Factorization : ");
		
		int number;
		Scanner Var = new Scanner(System.in);
		 number = Var.nextInt();
	     Var.close();
		
	     for(int i=2;i<=number;i++)
			{
				
				while(number%i==0)
				{
					number/=i;
					System.out.println(i);
					
				}
				
			}
		}
   }
