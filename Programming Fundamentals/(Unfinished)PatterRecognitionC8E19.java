/**
 * Chapter 8 Exercise 19:
 *
 *      (Pattern recognition: four consecutive equal numbers)
 *      Write the following method that tests whether a two-dimensional array
 *      has four consecutive numbers of the same value, either horizontally,
 *      vertically, or diagonally.
 *
 *      public static boolean isConsecutiveFour(int[][] values)
 *
 *      Write a test program that prompts the user to enter the number of
 *      rows and columns of a two-dimensional array and then the values in
 *      the array and displays true if the array contains four consecutive numbers
 *      with the same value. Other- wise, display false.
 *
 * Created by Luiz Arantes Sa on 8/30/14.
 */
/*Sebas*/
import java.util.*;


class Untitled {
	public static void main(String[] args) {
		int[][]matrix = createArray();
		print(matrix);
		System.out.println((consecRow(matrix) == true)? "There are four consecutive rows" : "false rows");
		System.out.println((consecCol(matrix) == true)? "There are four consecutive columns" : "false columns");
		System.out.println((consecDiagonal1(matrix) == true)? "There are four consecutive diagonals" : "false diagonals1");
	}
	public static boolean consecRow(int[][]m){
		int count = 1;
		for(int i = 0 ; i < m.length - 1; i++){
			for(int j =0; j < m[i].length; j++){
				if(m[i][j] == m[i + 1][j])
					count++;
				if(count >= 4)
					return true;
				if(m[i][j] != m[i+1][j])
					count = 1;
			}
		}
		return false;
	}
	public static boolean consecCol(int[][]m){
			int count = 1;
			for(int j = 0 ; j < m[0].length; j++){
				int current = m[0][j];
				for(int i = 0; i < m.length; i++){
					if(m[j][i] == current);
						count++;
					if(count >= 3)
						return true;
					if(m[j][i] != current);
						count = 1;
				}
			}
			return false;
		}
	public static boolean consecDiagonal1(int[][]m){
		for(int i = 0; i < m.length-1; i++){
			int count = 0;
			if(m[i][i] == m[i+1][i+1])
				count++;
			if(count >=2)
				return true;
			if((m[i][i] != m[i+1][i+1]))
				count = 1;
				}
			return false;
	}
	
	public static int [][] createArray(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows in your array: ");
		int n = input.nextInt();
		System.out.println("Please enter the number of columns in your array: ");
		int m = input.nextInt();
		int[][] array = new int[n][m];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = (int)(Math.random()*2);
			}
		}
		return array;
	}
	
	public static void print(int[][]m){
		for(int[]i:m)
			System.out.println(Arrays.toString(i));
	}
}