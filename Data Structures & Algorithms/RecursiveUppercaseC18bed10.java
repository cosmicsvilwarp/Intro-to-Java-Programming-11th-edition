/*Sebas*/
/*********************************************************************************
* (Find the number of uppercase letters in a string) Write a recursive method to *
* return the number of uppercase letters in a string. Write a test program that  *
* prompts the user to enter a string and displays the number of uppercase        *
* letters in the string.                                                         *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		String word = new Scanner(System.in).next();
		
		System.out.println("The total number of uppercase letters is " + countUpper(word));
	}
	
	public static int countUpper(String word){
		if(word.length() == 0) return 0;
		
		int isUpper = Character.isUpperCase(word.charAt(0)) ? 1 : 0;
		
		return isUpper + countUpper(word.substring(1));
	}
}