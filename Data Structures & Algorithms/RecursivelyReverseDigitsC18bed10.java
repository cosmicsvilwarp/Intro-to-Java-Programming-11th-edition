/*Sebas*/
/*********************************************************************************
* (Print the digits in an integer reversely) Write a recursive method that       *
* displays an int value reversely on the console using the following header:     *
*                                                                                *
* public static void reverseDisplay(int value)                                   *
*                                                                                *
* For example, reverseDisplay(12345) displays 54321. Write a test program that   *
* prompts the user to enter an integer and displays its reversal.                *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;


class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter a digit: ");
		int number = new Scanner(System.in).nextInt();
		
		reverseDisplay(number);
	}
	
	public static void reverseDisplay(int value){
		if(value <= 0) return;
		
		System.out.print(value % 10);
		
		reverseDisplay(value / 10);
	}
}