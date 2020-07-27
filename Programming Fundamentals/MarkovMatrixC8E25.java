/*********************************************************************************
* (Markov matrix) An n * n matrix is called a positive Markov matrix if each     *
* element is positive and the sum of the elements in each column is 1. Write the *
* following method to check whether a matrix is a Markov matrix.                 *
*                                                                                *
* public static boolean isMarkovMatrix(double[][] m)                             *
*                                                                                *
* Write a test program that prompts the user to enter a 3 * 3 matrix of double   *
* values and tests whether it is a Markov matrix.                                *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		//Generate a 3-by-3 matrix from userinput 
		double[][]matrix = creatMatrix();
		
		//Displays 3-by-3 matrix
		print(matrix);
		
		//// Test if matrix is a Markov matrix
		System.out.println("It is" +(isMarkovMatrix(matrix)? " " : " not ")+ "a Markov Matrix"); 
	}
	//Create Matrix 
	public static double[][] creatMatrix(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		double[][]matrix = new double[3][3];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}
	//Print matrix 
	public static void print(double[][]m){
		for(double[]i:m)
			System.out.println(Arrays.toString(i));
	}
	
	/*isMarkovMatrix returns true if each element is positive and if the sum of the elements in each column is 1*/
	public static boolean isMarkovMatrix(double[][] m){
		double total = 0;
		for(int j = 0; j < m.length; j++){
			total = 0;
			for(int i = 0 ; i < m.length; i++){
				if(m[i][j] < 0) return false;
				total += m[i][j];
			}
			if(total != 1)
				return false;
		}
		return true;
	}
}