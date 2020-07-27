/*Sebas*/
/*********************************************************************************
* (Stopwatch) Design a class named StopWatch. The class contains:                *
*                                                                                *
* ■ Private data fields startTime and endTime with getter methods.               *
* ■ A no-arg constructor that initializes startTime with the current time.       *
* ■ A method named start() that resets the startTime to the current time.        *
* ■ A method named stop() that sets the endTime to the current time.             *
* ■ A method named getElapsedTime() that returns the elapsed time for the        *
*   stopwatch in milliseconds.                                                   *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that measures the execution time of sorting 100,000 numbers using      *
* selection sort.                                                                *
*********************************************************************************/


import java.util.*;

public class StopWatchC9E6 {
	public static void main(String[] args) {
		// Create a StopWatch object
				StopWatch stopWatch = new StopWatch();

				// create array of 100,000 random numbers
				int[] randomArray = fillRandom();

				// Invoke the start method in StopWatch class
				stopWatch.start();

				// Sort array
				selectionSort(randomArray);

				// Invoke the stop method in StopWatch class
				stopWatch.stop();

				// Display the execution time
				System.out.println(Arrays.toString(randomArray));	
				System.out.println("\nThe execution time of sorting "+randomArray.length +
					" numbers using selection sort: " + (stopWatch.getElapsedTime())+" milliseconds");
	}
		
	static int[] fillRandom(){
		
		//Number of random integers 
		int n = 100000;
		
		//Random object 
		Random rand = new Random(3); 
		
		//Create Array
		int[] numbers  = new int[n];
		
		//Fill array with n amount of random numbers
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = rand.nextInt(i+1);
		}
		return numbers;
	}
	
	static void selectionSort(int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				int min = array[i];
				int minIndex = i;

				for (int j = i + 1; j < array.length; j++) {
					if (array[j] < min) {
						min = array[j];
						minIndex = j;
					}
				}

				if (i != minIndex) {
					array[minIndex] = array[i];
					array[i] = min;
				}
			}
	}
}