/*********************************************************************************
* (Row sorting) Implement the following method to sort the rows in a             *
* two-dimensional array. A new array is returned and the original array is       * 
* intact.                                                                        *
*                                                                                *
* public static double[][] sortRows(double[][] m)                                *
*                                                                                *
* Write a test program that prompts the user to enter a 3 * 3 matrix of double   *
* values and displays a new row-sorted matrix.                                   *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		double[][]matrix = createMatrix();
		
		print(matrix);
		
		System.out.println("\nThe sorted rows are: ");
		sortRows(matrix);
	}
	
	public static void sortRows(double[][] matrix){
		double[] temp = new double[matrix.length];
		for(int i = 0 ; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				temp[j] = matrix[i][j];
				}
				System.out.println(Arrays.toString(selectionSort(temp)));
				}
	}	
	
	//Fuction Generates matrix from user inout 
	public static double[][] createMatrix(){
		Scanner input = new Scanner(System.in);
		double[][]matrix = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for(int i = 0 ; i < matrix.length; i++){
			for(int j = 0 ; j < matrix[i].length; j++){
				matrix[i][j] = (int)(Math.random()*23);
			}
		}
		return matrix;
	}
	//Prints any given Matrix
	public static void print(double[][]m){
		for(double[]i:m)
			System.out.println(Arrays.toString(i));
	}
	
	public static double[] selectionSort(double[]m){
		double temp[] = new double[m.length];
		//Copy elements from Array to temp 
		for(int i = 0 ; i < m.length; i++){
			temp[i] = m[i];
		}
		//Selection Sort to sort array elements 
		for(int i = 0 ; i < temp.length; i++){
			double min = temp[i];
			int minindex = i;
			for(int j = i + 1 ; j < temp.length; j++){
				if(min > temp[j]){
					min = temp[j];
					minindex = j;
				}
			}
			if(minindex != i){
				temp[minindex] = temp[i];
				temp[i] = min;
			}
		}
		return temp; 
	}
}