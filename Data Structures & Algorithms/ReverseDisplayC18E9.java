/*Sebas*/
/*********************************************************************************
* (Print the characters in a string reversely) Write a recursive method that     *
* displays a string reversely on the console using the following header:         *  
*                                                                                *
* public static void reverseDisplay(String value)                                *
*                                                                                *
* For example, reverseDisplay("abcd") displays dcba. Write a test program that   *
* prompts the user to enter a string and displays its reversal.                  *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		
		// Prompt the user to enter a string
		String str = new Scanner(System.in).next();
		
		// Display the value reversely
		reverseDisplay(str);
	}
	
	/** Method displays the characters in a string reversely */
	private static void reverseDisplay(String str){
		if(str.length() == 0) return;
		
		char a = str.charAt(str.length() - 1);
		
		System.out.println(a);
		
		reverseDisplay(str.substring(0, str.length() - 1));	
	}
}