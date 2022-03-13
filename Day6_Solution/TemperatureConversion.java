package temperatureConversion;
import java.util.Scanner;


public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to Temperature Conversion");
	
		
	
			System.out.println("Enter Celsius Temperature : ");
			double num1,num2,Fahrenheit,Celsius;
			Scanner var = new Scanner(System.in);
			num1 = var.nextDouble();
		
			Fahrenheit = (num1 * 9/5) + 32 ;
			System.out.println("Converted into Fahrenheit Temperature is : " +Fahrenheit);
		
			System.out.println("Enter Fahrenheit Temperature : ");
			num2 = var.nextDouble();
			var.close();
			Celsius = (num2 - 32) * 5/9;
			System.out.println("Converted into Celsius Temperature is : " +Celsius);
		

		
   }
}
