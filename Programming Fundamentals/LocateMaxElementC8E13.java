/*********************************************************************************
* (Locate the largest element) Write the following method that returns the       *
* location of the largest element in a two-dimensional array.                    *
*                                                                                *
* public static int[] locateLargest(double[][] a)                                *
*                                                                                *
* The return value is a one-dimensional array that contains two elements. These  *
* two elements indicate the row and column indices of the largest element in the *
* two-dimensional array. Write a test program that prompts the user to enter a   *
* two-dimensional array and displays the location of the largest element in the  *
* array.                                                                         *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		//Fills array with random variables 
		double[][]values = fillArray();
		
		//Displays Matrix
		print(values);
		
		//Calls method to find largest element 
		int[]location = locateLargest(values);
		
		//Display results
		System.out.println("\nThe location of the largest element is at ("+location[0]+","+location[1]+")");
	}
	//Method creates and fills array with random numbers 
	public static double[][] fillArray(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][]matrix = new double[row][column];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = (int)(Math.random()*80);
			}
		}
		return matrix;
	}
	
	//Method to locate largest element
	public static int[] locateLargest(double[][] a){
		int[]position = new int[2];//1-D array to store location 
		double max = a[0][0];//Equals the first(or any) index
		
		//Iterate through array and find biggest element
		for(int i = 0; i < a.length; i++){
			double thismax = 0;
			for(int j = 0; j < a[i].length; j++){
				thismax = a[i][j];
				if(thismax > max){
					max = thismax;
					position[0] = i;
					position[1] = j;
				}
			}
		}
		return position;
	}
	//Method to print any given 2-D array
	public static void print(double[][]a){
		for(double[]i:a)
			System.out.println(Arrays.toString(i));
	}
}