/*Sebas*/
/*Call a 2D array sorted if its rows and its columns are nondecreasing. See Figure 12.3 on the facing page for an example of a 2D sorted array.
Design an algorithm that takes a 2D sorted array and a number and checks whether that number appears in the array. For example, if the input is the 2D sorted array in Figure 12.3 on the next page, and the number is 7, your algorithm should return false; if the number is 8, your algorithm should return true.*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;

class EPI11E6 {
	public static void main(String[] args) {
		int[][]matrix = {{ 10, 20, 30, 40 }, 
						{ 15, 25, 35, 45 }, 
						{ 27, 29, 37, 48 }, 
						{ 32, 33, 39, 50 } }; 
						
		int[][]matrix2 = {{ 0, 1, 2 },
						{ 3, 4, 5 },
						{ 6, 7, 8 }};
					
		
		print(matrix);	
		System.out.println("Search a 2D sorted Matrix: (discontinuous) ");
		System.out.println(discontinuousSortVariant(matrix, 10));
		
		System.out.println("\n\nSearch a 2D sorted Matrix: (continuous) ");
		System.out.println(continuousSortVariant(matrix2, 4));
	}
	public static boolean discontinuousSortVariant(int[][]matrix, int key){
		//Starting from bottom left (We can also start from top right)
		int row = matrix.length - 1, col = 0;
		while(row >= 0 && col < matrix[0].length){
			if(matrix[row][col] == key){
				return true;
			}
			else if(matrix[row][col] < key){
				col++; // go to the left
			}
			else{
				row--; //go up
			}
		}
		return false;
	}
	/*The left and right pointer to our search. We imagine a visualization
		of a 1D array and will use our mapping system to convert these indices
		into concrete locations in the 2D matrix.
		The the last position in the matrix if we consider it as array will be
		rows * cols - 1 indices.
		Same as an array...an array's last index is arr.length - 1.*/
		
	public static boolean continuousSortVariant(int[][]matrix, int key){
		int totalRows = matrix.length; int totalColumns = matrix[0].length;
		int low = 0; int high = totalRows * (totalColumns - 1);
		
		while(low <= high){
			int mid = low + (high - low)/2;
			int midElement = matrix[mid / totalColumns][mid % totalColumns];
			if(midElement == key){
				return true;
			}
			else if(midElement < key){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return false;
	}

	public static void print(int[][]m){
		for(int[]a : m)
			System.out.println(Arrays.toString(a));
	}
}