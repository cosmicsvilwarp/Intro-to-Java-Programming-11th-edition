/*Sebas*/
/*********************************************************************************
* (Maximum element in ArrayList) Write the following method that returns the     *
* maximum value in an ArrayList of integers. The method returns null if the      *
* list is null or the list size is 0.                                            *
*                                                                                *
* public static Integer max(ArrayList<Integer> list)                             *
*                                                                                *
* Write a test program that prompts the user to enter a sequence of numbers      *
* ending with 0, and invokes this method to return the largest number in the     *
* input.                                                                         *
*********************************************************************************/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);  
		 
		// Prompt the user to enter a sequence of numbers ending with 0
		System.out.print("Enter integers (input ends with 0): ");
		int value;
		
		do {
			value = input.nextInt(); // Read a value from the input
			
			if (value != 0) 
				list.add(value); // Add the value if it is not in the list
		} while (value != 0);

		// Display the maximum number
		System.out.print("The maximum number is " + max(list));
	}
	/** Return the maximum value in an ArrayList of integers */
	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.size() == 0)
			return null;
		
		int result = list.get(0);
		for (int i = 1; i < list.size(); i++)
			if (result < list.get(i))
				result = list.get(i);
		
		return result;
	}
}