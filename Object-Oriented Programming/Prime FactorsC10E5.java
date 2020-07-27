/*********************************************************************************
* (Displaying the prime factors) Write a program that prompts the user to enter  *
* a positive integer and displays all its smallest factors in decreasing order.  *
* For example, if the integer is 120, the smallest factors are displayed as      *
* 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors              *
* (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.          *
*********************************************************************************/
import java.util.*;
import TestStackOfIntegers.StackOfIntegers;

class Untitled{
	public static void main(String[] args){
		// Create a Scanner
				Scanner input = new Scanner(System.in);

				// Prompt the user to enter a positive integer
				System.out.print("Enter a positive integer: ");
				int number = input.nextInt();

				// Displays all the number's smallest factors in decreasing order
				System.out.print("The smallest factors of " + number + " are: ");
				StackOfIntegers stack = new StackOfIntegers(); // Create a StackOfIntegers

				smallestFactors(number, stack);

				while (!stack.empty()) {
					System.out.print(stack.pop() + " ");
				}
				System.out.println();
			}

			/** Find smallestFactors and push them to StackOfIntegers */
		
	public static void smallestFactors(int n, StackOfIntegers stack){
		int k = 2; //Potential Prime Factor
		
				while (k <= n) {
					if (n % k == 0) {
						stack.push(k);
						n /= k;
					} else {
						k++;
					}
				}
	}
}