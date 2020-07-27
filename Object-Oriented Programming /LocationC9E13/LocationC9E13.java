/*Sebas*/
/*********************************************************************************
* (The Location class) Design a class named Location for locating a maximal      *
* value and its location in a two-dimensional array. The class contains public   *
* data fields row, column, and maxValue that store the maximal value and its     *
* indices in a two-dimensional array with row and column as int types and        *
* maxValue as a double type.                                                     *
*                                                                                *
* Write the following method that returns the location of the largest element in *
* a two-dimensional array:                                                       *
*                                                                                *
* public static Location locateLargest(double[][] a)                             *
*                                                                                *
* The return value is an instance of Location. Write a test program that prompts *
* the user to enter a two-dimensional array and displays the location of the     *
* largest element in the array.                                                  *
*********************************************************************************/
import java.util.Scanner;
import java.util.*;

public class LocationC9E13 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a two-dimensional array
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();

		// Create a matrix
		double[][] array = new double[rows][columns]; 
		Random rand = new Random(9);
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(100);
			}
		}
		//Visualize Array
		print(array);

		// Get and instance of Loacation
		Location max = locateLargest(array);

		// Display the location of the largest element in the array
		System.out.println("\nThe location of the largest element is " +
			max.maxValue + " at (" + max.row + ", " + max.column + ")");
	}

	/** locateLargest returns an instance of Location */
	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}
	public static void print(double[][]a){
		for(double[]i:a)
			System.out.println(Arrays.toString(i));
	}
}