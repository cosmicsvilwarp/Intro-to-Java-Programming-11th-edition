/*Sebas*/
/**
 * Chapter 30 Exercise 2:
*
 *(Count occurrence of numbers) Rewrite Programming Exercise 7.3 using streams.
 *      (Reference)
 *      Write a program that reads the integers between 1 and 50 and counts
 *      the occurrences of each. Assume the input ends with 0.
*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter the integers between 1 and 100: ");
		
		// Read all numbers
		int number = input.nextInt(); // number read from a file
		while (number != 0) {
			if (number <= 100 && number >= 0)
				list.add(number); 
			number = input.nextInt(); 
		}

		list.stream()
			.collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
			.forEach((k, v) -> System.out.println(k + " occurs " + v + (v == 1 ? " time " : " times")));
	}
}
		