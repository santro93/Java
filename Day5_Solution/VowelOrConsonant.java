package vowelOrConsonant;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		System.out.println("Welcome to Check Whether an Alphabet is Vowel or Consonant Program");
		//use scanner to get user inputs
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Alphabet to check Vowel or Constant: ");  
		 char alpha = sc.next().charAt(0);
		        sc.close();
		//if condition to check alpha is vowel or consonant
		if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
		  alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {

			System.out.println(alpha+" is a Vowel ");
			}
		else {
			System.out.println(alpha+" is a Consonant ");
			}
	}

}
