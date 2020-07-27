import java.util.Scanner;
import java.util.*;

class ComputeFibonacci {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();

		// Find and display the Fibonacci number
		System.out.println("The Fibonacci number at index "  
			+ index + " are: ");
		for(int i = 0; i <= index; i++){
			System.out.println(i + ": " + fib(i));
		}
	}
	
	private static long[]f = new long[300];
	/** The method for finding the Fibonacci number */
	public static long fib(int index) {
		if (index <= 1) // Base case
			return index;
		if(f[index] > 0) return f[index];
		f[index] = fib(index - 1) + fib(index - 2);
		return f[index];
	}
}
