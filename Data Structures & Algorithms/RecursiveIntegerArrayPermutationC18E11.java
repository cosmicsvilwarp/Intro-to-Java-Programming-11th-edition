/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

/* 
Write a recursive method that displays all permutations of a given array of integers. Here is a sample run:

Enter the array size : 3 
	[1, 2, 3]
	[1, 3, 2]
	[2, 1, 3]
	[2, 3, 1] 
	[3, 1, 2] 
	[3, 2, 1]
*/

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int[]numbers = getArray(input.nextInt());
		
		//Display results
		permute(numbers);
	}
	
	public static void permute(int[]a){
		permute(a, 0);
	}
	private static void permute(int[]a, int start){
		if(start >= a.length){
			System.out.println(Arrays.toString(a));
		}
		else{
			for(int i = start; i < a.length; i++){
				swap(a, start , i);
				permute(a, start + 1);
				swap(a, start, i);
			}
		}
	}
	
	private static void swap(int[]a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static int[]getArray(int n){
		int[]array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = i + 1;
		}
		return array;
	}
}