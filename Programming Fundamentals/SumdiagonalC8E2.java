/*********************************************************************************
* (Sum the major diagonal in a matrix) Write a method that sums all the numbers  *
* in the major diagonal in an n * n matrix of double values using the following  *
* header:                                                                        *
*                                                                                *
* public static double sumMajorDiagonal(double[][] m)                            *
*                                                                                *
* Write a test program that reads a 4-by-4 matrix and displays the sum of all    *
* its elements on the major diagonal.                                            *
*********************************************************************************/

/*Sebas*/

import java.util.*;
import java.awt.geom.*;

class Untitled {
	public static void main(String[] args) {
		
		//Create Matrix 
		double[][] board = fillMatrix();
		
		//Print each diagonals
		sumDiagonals(board);
	}
	
	/** getMatrix returns a matrix initialized with user input */
	public static double[][] fillMatrix(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] array = new double[4][4];
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[0].length; j++){
				array[i][j] = input.nextDouble();
			}
		}
		return array;
		}
		
		/** sumMajorDiagonal returns the sum of all 
			    the matrix elements for each diagonal */
	public static void sumDiagonals(double[][]array){
		double sumd1 = 0, sumd2 = 0;
		
		for(int i = 0; i < array.length; i++){
			sumd1 += array[i][i];
			sumd2 += array[i][array.length - i - 1];
			}
			
		System.out.println("Sum of the principal diagonal is "+ sumd1);
		System.out.println("Sum of the secondary diagonal is "+ sumd2);
		
	}	
}