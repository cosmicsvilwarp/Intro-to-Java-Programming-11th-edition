/*Sebas*/
/*********************************************************************************
* (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:*
*                                                                                *
* public static void sort(ArrayList<Integer> list)                               *
*                                                                                *
* Write a test program that prompts the user to enter 5 numbers, stores them in  *
* an array list, and displays them in increasing order.                          *
*********************************************************************************/
import java.util.*;

class Exercise_11_11 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create an ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

		// Stort numbers
		sort(list);

		// Display list in increasing order
		System.out.println("\nAfter Sorting");
		System.out.println(list.toString());
	}

	/** Sorts an ArrayList of Integers */
	public static void sort(ArrayList<Integer> list) {

			// simple solution
			//Collections.sort(list);

			// manual solution
			for (int i = 0; i < list.size() - 1; i++) {
				int currentMin = list.get(i);
				int currentIndex = i;

				for (int j = i + 1; j < list.size(); j++) {
					if (currentMin > list.get(j)) {
						currentMin = list.get(j);
						currentIndex = j;
					}
				}

				if (currentIndex != i) {
					list.set(currentIndex, list.get(i));
					list.set(i, currentMin);
				}
			}

		}
	}