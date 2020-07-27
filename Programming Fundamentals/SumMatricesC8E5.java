/*********************************************************************************
* (Algebra: add two matrices) Write a method to add two matrices. The header of  *
* the method is as follows:                                                      *
*                                                                                *
* public static double[][] addMatrix(double[][] a, double[][] b)                 *
*                                                                                *
* In order to be added, the two matrices must have the same dimensions and the   *
* same or compatible types of elements. Let c be the resulting matrix. Each      *
* element cij is aij + bij.                                                      *
* Write a test program that prompts the user to enter two 3 * 3 matrices and     *
* displays their sum.                                                            *
*********************************************************************************/

/*Sebas*/

import java.util.*;

class Untitled {
	public static void main(String[] args) {
		// Initialize two 3 x 3 matrices
		double[][]a = fillMatrix();
		double[][]b = fillMatrix();
		
		// Initialize matrix3 with the sum of matrix1 and matrix2
		double [][]c = addMatrix(a, b);
		
		//Display matrix 1, 2, 3
		printItem(a);
		System.out.println();
		printItem(b);
		System.out.println();
		printItem(c);
		}
		
	//Method to create 3-by-3 matrices
	public static double[][] fillMatrix(){
		double[][] a = new double[3][3];
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				a[i][j] = (int)(Math.random()*8);
			}
		}
		return a;
	}
	/** addMatrix adds two matrices and returns the result */
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][]c = new double[3][3];
		
		for(int i = 0; i < c.length; i++){
			for(int j = 0; j< c[i].length; j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		return c;
	}
	//Method to print any given matrix
	public  static void printItem(double[][]c){
		for(int i =0; i < c.length; i++){
			for(int j =0; j < c[i].length; j++){
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}