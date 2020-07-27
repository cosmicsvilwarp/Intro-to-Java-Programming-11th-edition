/*Sebas*/
/**
 * (Analyze scores) Rewrite Programming Exercise 7.4 using streams.
 *		(Reference)
 *      (Analyze scores)
 *      Write a program that reads an unspecified number of scores
 *      and determines how many scores are above or equal to the average
 *      and how many scores are below the average. Enter a negative number
 *      to signify the end of the input.
 *      Assume that the maximum number of scores is 100.
 *
 * 
 */
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Enter a new Score: ");
		
		//Read inputs 
		double number = input.nextDouble();
		while(number > 0){
			list.add(number);
			number = input.nextDouble();
			if(list.size() >= 100)
				break;
		}
		double average = list.stream().mapToDouble(e -> e).average().getAsDouble();
		double aboveAverage = list.stream().filter(e -> e >= average).count();
		double belowAverage = list.stream().filter(e -> e < average).count();
		
		System.out.println("\nScores above average : " + aboveAverage);
		System.out.println("Scores below average : " + belowAverage);
	}
}