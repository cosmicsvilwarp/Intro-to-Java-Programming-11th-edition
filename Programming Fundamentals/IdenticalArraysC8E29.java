/*********************************************************************************
* (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly  *
* identical if their corresponding elements are equal. Write a method that       *
* returns true if m1 and m2 are strictly identical, using the following header:  *
*                                                                                *
* public static boolean equals(int[][] m1, int[][] m2)                           *
*                                                                                *
* Write a test program that prompts the user to enter two 3 * 3 arrays of        *
* integers and displays whether the two are strictly identical. Here are the     *
* sample runs.                                                                   *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		// Prompt the user to enter two 3 x 3 arrays of integers
		System.out.println("Enter list1: ");
		int[][]list1 = {{51, 25, 22},{6, 1, 4},{24, 54, 6}};
		
		System.out.println("Enter list2: ");
		int[][]list2 = {{51, 22, 25},{6, 1, 4},{24, 54, 6}};
		
		//Display arrays for input values 
		print(list1);
		System.out.println();
		print(list2);
		
		//Dis[play whether the two arrays are strictly identical 
		System.out.println("The two arrays are"+(equals(list1,list2)? " " : " not ")+"identical");
	}
	public static int[][]getArray(){
		Scanner input = new Scanner(System.in);
		int[][]array = new int[3][3];
		for(int i = 0; i < array.length; i++){
			for(int j = 0 ; j < array[i].length; j++){
				array[i][j] = input.nextInt();
			}
		}
		return array;
	}
	/** equals returns true if m1 and m2 are  identical */
	public static boolean equals(int[][] m1, int[][] m2){
			int totalm1 = 0;
			int totalm2 = 0;
		for(int i = 0 ; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				totalm1 += m1[i][j];
				totalm2 += m2[i][j];
				}
		}
		if(totalm1 != totalm2)
			return false;
		else
			return true;
}
	
	public static void print(int[][]m){
		for(int[]i:m)
			System.out.println(Arrays.toString(i));
	}
}