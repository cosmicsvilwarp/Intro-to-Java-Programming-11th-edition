/*********************************************************************************
* (Largest row and column) Write a program that randomly fills in 0s and 1s into *
* a 4-by-4 matrix, prints the matrix, and finds the first row and column with    *
* the most 1s.                                                                   *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[][]board = fillArray();
		
		//Displays MAtrix
		print(board);
		
		// Find and display the first row and column with the most 1s
		getMaxRow(board);
		getMaxCol(board);
	}
	
	/** largestRow  finds the first row with the most 1s */
	public static void getMaxRow(int[][]matrix){
		int maxrow = 0;
		int indexrow = 0;
		int thisrow =0;
		
		for(int row = 0; row < matrix.length; row++){
			thisrow = 0;
			for(int column = 0; column < matrix[row].length; column++){
				thisrow += matrix[row][column];
				if(thisrow > maxrow){
					maxrow = thisrow;
					indexrow = row;
				}
			}
		}
		System.out.println("The row with most is row "+indexrow);
	}
	
	/** largestColumn finds the first column with the most 1s */
	public static void getMaxCol(int[][]matrix){
			int maxcol = 0;
			int indexcol = 0;
			int thiscol =0;
		
			for(int column = 0; column < matrix[0].length; column++){
				thiscol = 0;
				for(int row = 0 ; row < matrix.length; row++){
					thiscol += matrix[row][column];
					if(thiscol > maxcol){
						maxcol = thiscol;
						indexcol = column;
					}
				}
			}
			System.out.println("The col with  the most is column "+indexcol);
		}
		
//Method to fill array with 0's and 1's 
	public static int[][] fillArray(){
		int [][] array = new int[4][4];
		for(int i =0; i < array.length; i++){
			for(int j = 0 ; j < array[i].length; j++){
				array[i][j] = (int)(Math.random()*2);
			}
		}
		return array;
	}
	
	//Method to print 2d array
	public static void print(int[][]array){
		for(int[] i: array)
				System.out.println(Arrays.toString(i));
	}
}