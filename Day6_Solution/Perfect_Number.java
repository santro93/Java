package perfect_Number;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		System.out.println("Welcome to Perfect Number Program ");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		int sum = 0;
		
			    while(i<=n/2)
			    {
			       if(n%i==0)
			       {
				sum+=i;
			       }
			      i++;
			    }
			if(sum==n){
			System.out.println(n+" is a perfect number");
		               } 
			else{
			System.out.println(n+" is not a  perfect number"); 
						}
	}
}