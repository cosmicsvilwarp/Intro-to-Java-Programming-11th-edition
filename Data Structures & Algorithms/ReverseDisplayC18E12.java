/*Sebas*/
/*********************************************************************************
* (Print the characters in a string reversely) Rewrite Programming Exercise 18.9 *
* using a helper method to pass the substring high index to the method. The      *
* helper method header is:                                                       *
*                                                                                *
* public static void reverseDisplay(String value, int high)                      *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;


class Untitled {
	
	public static void main(String[] args) {
		//Prompt user for input
		System.out.println("Enter a Word: ");
		String word = new Scanner(System.in).next();
		
		//Display result
		reverseDisplay(word);
	}
	
	public static void reverseDisplay(String word){
		int high = word.length();
		reverseDisplay(word, high);
	}
	
	private static void reverseDisplay(String word, int high){
		if(high == 0) return;
		
		char a = word.charAt(high - 1);
		
		System.out.print(a);
		
		reverseDisplay(word, high - 1);
	}
}