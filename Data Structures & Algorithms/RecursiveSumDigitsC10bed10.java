/*Sebas*/
/*********************************************************************************
* (Sum the digits in an integer using recursion) Write a recursive method that   *
* computes the sum of the digits in an integer. Use the following method header: *
*                                                                                *
* public static int sumDigits(long n)                                            *
*                                                                                *
* For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program that   *
* prompts the user to enter an integer and displays its sum.                     *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		
		System.out.println("The sum of the numbers is " + sumDigits(number));
	}
	
	public static int sumDigits(int number){
		if(number <= 0) return 0;
		
		return (number % 10) + sumDigits(number / 10);
	}
}