/*********************************************************************************
* (Sum elements column by column) Write a method that returns the sum of all the *
* elements in a specified column in a matrix using the following header:         *
* public static double sumColumn(double[][] m, int columnIndex)                  *
* Write a test program that reads a 3-by-4 matrix and displays the sum of each   *
* column.                                                                        *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		//Read and input data to 3 by 4 matrix
		double[][] matrix = fillMatrix();
		
		//Display sum of each column
		sumColumn(matrix);
		
	}
	/***Fills matrix with input***/
	public static double[][] fillMatrix(){
		Scanner input = new Scanner(System.in);
		double[][] array = new double[3][4];
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		for(int row = 0; row < array.length; row++){
			for(int column = 0; column < array[0].length; column++){
				array[row][column] = input.nextDouble();
			}
		}
		return array;
	}
	
	/** sum prints the sum of the elements for each column*/
	public static void sumColumn(double[][]array){
		
		for(int column = 0; column < array[0].length; column++){
			double sum = 0;
			for(int row = 0; row < array.length; row++)
				 sum += array[row][column];
				System.out.print("\nSum of the elements at column "+column+ " is " + sum);
		}
	}
}
				