/*(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, displays the matrix, and checks if every row and every column have an even number of 1s.*/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		//Generate 6-by-6 matrix and display it 
		int[][]matrix = fillArray();
		print(matrix);
		
		// Display if every row and every column have an even number of 1s
				System.out.println("Every row does" + 
					(isAllRowsEven1s(matrix) ? " " : " not " + 
						"have an even number of 1s"));
				System.out.println("Every column does" + 
					(isAllColumnsEven1s(matrix) ? " " : " not " + 
						"have an even number of 1s"));
			}
			
	public static boolean isAllRowsEven1s(int[][]m){
		//boolean iseven = true;
		
		for(int i = 0 ; i < m.length; i++){
			int count = 0;
			for(int j = 0; j < m[i].length; j++){
				if(m[i][j] == 1){
					count++;
				}
			}
			if(count % 2 != 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isAllColumnsEven1s(int[][]m){
			//boolean iseven = true;
			
			for(int i = 0 ; i < m.length; i++){
				int count = 0;
				for(int j = 0; j < m[i].length; j++){
					if(m[j][i] == 1){
						count++;
					}
				}
				if(count % 2 != 0){
					return false;
				}
			}
			return true;
		}
	
	public static int[][] fillArray(){
		int[][]matrix = new int[6][6];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = (int)(Math.random()*2);
			}
		}
		return matrix;
	}
	public static void print(int[][]m){
		for(int[]i:m)
			System.out.println(Arrays.toString(i));
	}
}