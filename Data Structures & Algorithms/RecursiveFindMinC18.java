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
	
	public static int isMax(int[]a){
		int length = a.length;
		return isMax(a, length);
	}
	private static int isMax(int[]a, int length){
		if(length == 0) return a[0];
		
		return Math.min(a[length - 1], isMax(a, length - 1));
	}
}
