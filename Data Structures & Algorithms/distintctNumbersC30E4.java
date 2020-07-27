/*Sebas*/

/*(Print distinct numbers) Rewrite Programming Exercise 7.5 using streams. Dis-
play the numbers in increasing order.*/

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
	int[] numbers = new int[10]; // numbers array will store distinct values, maximum is 10

	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Enter " + numbers.length + " numbers: ");

	for (int i = 0; i < numbers.length; i++) {
		// Read an input
		numbers[i] = input.nextInt();
	}
	//No distinct nor sorted needed as TreeSet already does that 
	//TreeSet inherently has non-dup values and sorts them
	System.out.println("Distinct numbers: ");
	
	IntStream.of(numbers).mapToObj(e -> e)
						.collect(TreeSet::new, TreeSet::add, TreeSet::addAll)
						.forEach((values) -> System.out.print(values + "  "));
	}
}