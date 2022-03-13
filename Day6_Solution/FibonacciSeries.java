package fibonacciSeries;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Welcome to Fibonacci Series Program");

		
		int num1 = 0, num2 = 1;
		int sum = 0;
		int n = 9;

		System.out.print("Fibonacci numbetrs are : ");
		System.out.print(" "+num1+" "+num2);

		for(int i =2; i < n; i++) {
			sum = num1 + num2;
			System.out.print(" "+sum);
			num1 = num2;
			num2 = sum;
			num2 = sum;	
		}

		
	}

}
