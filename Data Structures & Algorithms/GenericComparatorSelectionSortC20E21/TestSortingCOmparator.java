/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Comparator;
/*********************************************************************************
* (Use Comparator) Write the following generic method using selection sort and a *
* comparator.                                                                    *
*                                                                                *
* public static <E> void selectionSort(E[] list,                                 *
* 	 Comparator<? super E> comparator)                                            *
*                                                                                *
* Write a test program that creates an array of 10 GeometricObjects and invokes  *
* this method using the GeometricObjectComparator introduced in Listing 20.4 to  *
* sort the elements. Display the sorted elements.                                *
*********************************************************************************/


class testSolution {
	public static void main(String[] args) {
		// Create an array of 10 GeometricObjects
		GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
			new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5),
			new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
			new Circle(6.5), new Rectangle(4, 5)};
		
		String[] list2 = {"red", "blue", "green", "yellow", "orange", "pink"};
		
		//sorts six strings by their last character.
		Arrays.sort(list2, Comparator.comparing((e) -> e.charAt(e.length() - 1)));
		System.out.println("Sorted Strings (By last Character): \n");
		
		//Display sorted
		Arrays.stream(list2).forEach(e -> System.out.println(e));
		
		// Invoke selection sort using GeometricObjectComparator
		selectionSort(list, new GeometricObjectComparator());
		
		// Display the sorted elements
		System.out.print("\n\nSorted elements: ");
		for (GeometricObject e: list) {
				System.out.printf("%.2f ", e.getArea());
		}
		System.out.println();
	}
	

	/** Generic selection sort method */
	public static <E> void selectionSort(E[] list,
			Comparator<? super E> comparator) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			E currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (comparator.compare(currentMin, list[j]) > 0) {
				currentMin = list[j];
				currentMinIndex = j;
			}
		}

		// Swap list[i] with list[currentMinIndex] if necessary
		if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}