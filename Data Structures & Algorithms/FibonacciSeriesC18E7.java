/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();

		// Find and display the Fibonacci number
		System.out.println("The Fibonacci number at index "  + index + " is " + fib(index));
		System.out.println("The count is " + count);
	}
	static int count;
	public static int fib(int index){
		count++;
		if(index == 0)
			return 0;
		else if(index == 1)
			return 1;
		else
			return fib(index - 1) + fib(index - 2);
	}
}