/*********************************************************************************
* (Displaying the prime numbers) Write a program that displays all the prime     *
* numbers less than 120 in decreasing order. Use the StackOfIntegers class       *
* to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them  *
* in reverse order.                                                              *
*********************************************************************************/
/*Sebas*/
import java.util.*;
import TestStackOfIntegers.StackOfIntegers;

class PrimeNumbersC10E6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter positive integer
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		StackOfIntegers stack = new StackOfIntegers(100);//New Stack of Integers
		
		//Pushes prime numbers to stack in increasing order
		int i = 1;
		while (i <= number){
			i++;
			if(isPrime(i))
				stack.push(i);
		}
		
		//Display all the prime numbers in decreasinng order 
		System.out.println("The Prime Numbers less than " +number+ " are: ");
		while(!stack.empty())
			System.out.println(stack.pop()+ " ");
	}
	/**///isPrime returns true if n is a Prime number 
	public static boolean isPrime(int n){
		
		for(int k = 2; k < n/2; k++){
			if(n % k == 0)
				return false;
		}
		return true;
	}
}