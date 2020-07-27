/*********************************************************************************
* (Compute the weekly hours for each employee) Suppose the weekly hours for all  *
* employees are stored in a two-dimensional array. Each row records an employee’s*
* seven-day work hours with seven columns. For example, the following            *
* array stores the work hours for eight employees. Write a program that displays *
* employees and their total hours in decreasing order of the total hours.        *
*********************************************************************************/
//2d array - sum employee hours from columns rows
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		//Fill matrix with hours worked 
		int[][]matrix = fillMatrix();
		
		//Insert employees hours worked in a 2D array
		int[][] schedule = totalHours(matrix);
		
		//displays employees and their total hours in decreasing order of the total hours.
		sort(schedule);
		
		//Print Matrices
		printItem(matrix);
		System.out.println();
		printItem(schedule);
	}
	
	public static int[][] fillMatrix(){
		int[][]matrix = new int[8][7];
		//fill matrix
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = 2 + (int)(Math.random() * 8);
			}
		}
		return matrix;
	}
		
		
		public static int[][] totalHours(int[][]matrix){
			final int EMPLOYEE = 0;
			final int HOURS = 1;
			int[][] schedule = new int [matrix.length][2];
			for(int i = 0; i < matrix.length; i++){
				for(int j = 0; j < matrix[i].length; j++){
					schedule[i][EMPLOYEE] = i;
					schedule[i][HOURS] += matrix[i][j]; 
				}
			}
			return schedule;
		}
		
		public static void printItem(int[][]array){
		for(int i = 0; i < array.length; i++){
			for(int j =0; j < array[i].length; j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		}
		
		public static int[][]sort(int[][]array){
			for(int i = 0; i < array.length; i++){
				int col0 = array[i][0];
				int col1 = array[i][1];
				int index = i;
				for(int j = i + 1; j < array.length; j++){
					if(col1 < array[j][1]){
						col1 = array[j][1];
						col0 = array[j][0];
						index = j;
					}
				}
				if(index != i){
					array[index][1] = array[i][1];
					array[index][0] = array[i][0];
					array[i][1] = col1;
					array[i][0] = col0;
				}
			}
			return array;
		}
}