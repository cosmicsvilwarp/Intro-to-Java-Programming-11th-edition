/*(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with 0s and 1s. All rows and all columns have an even number of 1s. Let the user flip one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which cell was flipped. Your program should prompt the user to enter a 6-by-6 array with 0s and 1s and find the first row r and first column c where the even number of the 1s property is violated (i.e., the number of 1s is not even). */
/*Sebas*/
//Game: find the flipped cell
import java.util.*;
import javax.swing.text.*;

class Untitled {
	public static void main(String[] args) {
		//Generate 6-by-6 matrix and display it 
		int[][]matrix = fillArray();
		print(matrix);
		
		// Find the first row r and first column c where 
		// the even number of the 1s property is violated
		int row = findPositionRow(matrix);
		int col = findPositionCol(matrix);
		
		//Display the flipped cell
		if(row < 0 || col < 0)
			System.out.println("No cell has been flipped");
		else
			System.out.println("The fliiped cell is at ("+row+","+col+")");
		
		}
	//fillArray initializes array and inputs randomly inset 0's and 1's 	
	public static int[][] fillArray(){
			Scanner input = new Scanner(System.in);
			int[][]matrix = new int[6][6];
			//System.out.println("Please enter a "+matrix.length+"-by-"+matrix[0].length+" matrix row by row: ");
			for(int i = 0; i < matrix.length; i++){
				for(int j = 0; j < matrix[i].length; j++){
					matrix[i][j] = (int)(Math.random()*2);
				}
			}
			return matrix;
		}			
		
		/** Method returns index of row with odd number of 1s */
	public static int findPositionRow(int[][]m){
		//Stores coordinates of where property is violated
		for(int i = 0 ; i < m.length; i++){
			int count = 0;
			for(int j = 0; j < m[i].length; j++){
				if(m[i][j] == 1){
					count++;
				}
			}
			if(count % 2 != 0){
				return i;
			}
		}
		return -1;
		}
		
		/** Method returns index of col with odd number of 1s */
		public static int findPositionCol(int[][]m){
				//Stores coordinates of where property is violated
				for(int i = 0 ; i < m.length; i++){
					int count = 0;
					for(int j = 0; j < m[i].length; j++){
						if(m[j][i] == 1){
							count++;
						}
					}
					if(count % 2 != 0){
						return i;
					}
				}
				return -1;
				}
	//Method prints out any given matrix 
	public static void print(int[][]m){
		for(int[]i:m)
			System.out.println(Arrays.toString(i));
	}
}