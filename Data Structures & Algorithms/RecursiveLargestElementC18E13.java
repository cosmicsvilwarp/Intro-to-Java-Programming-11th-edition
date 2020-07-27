/*Sebas*/
/*********************************************************************************
* (Find the largest number in an array) Write a recursive method that returns    *
* the largest integer in an array. Write a test program that prompts the user to *
* enter a list of eight integers and displays the largest element.               *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		int[]value = {2, 1, 3, 1, 2, 5, 2, -1, 11, 0};
		
		// Display the largest element
		System.out.println("The largest value is " + isMax(value));
	}
	
	public static int isMax(int[]a) {
		int index = a.length - 1;
		int max = a[a.length - 1];
		
		return isMax(a, index, max);
	}
	
	public static int isMax(int[] a, int index, int max) {
		if(index == 0) return max;
		
		if(a[index] > max)
			max = a[index];
		
		return isMax(a, index - 1, max);
	}
}
