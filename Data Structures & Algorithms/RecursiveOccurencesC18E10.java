/*Sebas*/
/*********************************************************************************
* (Occurrences of a specified character in a string) Write a recursive method    *
* that finds the number of occurrences of a specified letter in a string using   *
* the following method header:                                                   *
*                                                                                *
* public static int count(String str, char a)                                    *
*                                                                                *
* For example, count("Welcome", 'e') returns 2. Write a test program that        *
* prompts the user to enter a string and a character, and displays the number of *
* occurrences for the character in the string                                    *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input 
		System.out.println("Enter word: ");
		String str = input.next();
		System.out.println("Enter a character: ");
		char a = input.next().charAt(0);
		
		System.out.println("The number of occurences of " + a + " is " + count(str, a));
	}
	public static int count(String str, char a){
		//return 0 if string is empty
		if(str.length() == 0) return 0;
		
		int sum = str.charAt(str.length() - 1) == a ? 1 : 0;
		
		return sum + count(str.substring(0, str.length() - 1), a);
	}
}