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

		
		print(matrix);	
		System.out.println("Search a 2D sorted Matrix: (discontinuous) ");
		System.out.println(searchMatrix(matrix, 10));
	}

	public static void print(int[][]m){
		for(int[]a : m)
			System.out.println(Arrays.toString(a));
	}
	 public static boolean searchMatrix(int[][] matrix, int target) {
			final int m = matrix.length;
			if (m == 0 || matrix[0].length == 0) {
				return false;
			}
			final int n = matrix[0].length;

			return searchMatrix(matrix, target, 0, m - 1, 0, n - 1);
		}
/*First, we divide the matrix into four quarters as shown below:

	zone 1      zone 2
*  *  *  * | *  *  *  *
*  *  *  * | *  *  *  *
*  *  *  * | *  *  *  *
*  *  *  * | *  *  *  *
-----------------------
*  *  *  * | *  *  *  *
*  *  *  * | *  *  *  *
*  *  *  * | *  *  *  *
*  *  *  * | *  *  *  *
	zone 3      zone 4
We then compare the element in the center of the matrix with the target. There are three possibilities:

center < target. In this case, we discard zone 1 because all elements in zone 1 are less than target.

center > target. In this case, we discard zone 4.

center == target. return true.*/
	public static boolean searchMatrix(int[][] matrix, int target, int rowStart, int rowEnd, int colStart, int colEnd) {
			int rowMiddle = rowStart + (rowEnd - rowStart) / 2;
			int colMiddle = colStart + (colEnd - colStart) / 2;
			if (rowStart > rowEnd || colStart > colEnd) {
				return false;
			}
			int valMiddle = matrix[rowMiddle][colMiddle];
			if (target == valMiddle) {
				return true;
			}
			if (target < valMiddle) {
				return searchMatrix(matrix, target, rowStart, rowEnd, colStart, colMiddle - 1)
						|| searchMatrix(matrix, target, rowStart, rowMiddle - 1, colMiddle, colEnd);
			} else {
				return searchMatrix(matrix, target, rowStart, rowEnd, colMiddle + 1, colEnd)
						|| searchMatrix(matrix, target, rowMiddle + 1, rowEnd, colStart, colMiddle);
			}
		}
}
