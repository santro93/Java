package reverse_Number;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		System.out.println("Welcome to Reverse Number Program. ");
		
		System.out.println("Enter a number : ");
		Scanner var = new Scanner(System.in);
		int num = var.nextInt();
			var.close();
		
		int reverse = 0;
		while(num != 0) {
		int remainder = num % 10;
		reverse = (reverse * 10) + remainder;
		num = num / 10;
		}
		
		System.out.println("reverse numver is : "+reverse);
		
	}

}
