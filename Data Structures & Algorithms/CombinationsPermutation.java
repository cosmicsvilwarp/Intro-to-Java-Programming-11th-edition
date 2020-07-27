/*Sebas*/
/*Combinations. Write a program Combinations that takes an integer com- mand-line argument n and prints all 2n combinations of any size. A combination is a subset of the n elements, independent of order. As an example, when n = 3, you should get the following output:
	a ab abc ac b bc c
Note that your program needs to print the empty string (subset of size 0).*/

//Write a program Combinations.java that takes an integer command-line argument n and prints all 2n combinations of any size. A combination is a subset of the n elements, independent of order. As an example, when n = 3, you should get the following output:

import java.io.*;
import java.net.*;
import java.util.*;

class Combinations {

	// print all subsets of the characters in s
	public static void comb1(String s) { comb1("", s); }

	// print all subsets of the remaining elements, with given prefix 
	private static void comb1(String prefix, String s) {
		if (s.length() > 0) {
			System.out.println(prefix + s.charAt(0));
			comb1(prefix + s.charAt(0), s.substring(1));
			comb1(prefix,               s.substring(1));
		}
	}  

	// alternate implementation
	public static void comb2(String s) { comb2("", s); }
	private static void comb2(String prefix, String s) {
		System.out.println(prefix);
		for (int i = 0; i < s.length(); i++)
			comb2(prefix + s.charAt(i), s.substring(i + 1));
	}  


	// read in N from command line, and print all subsets among N elements
	public static void main(String[] args) {
		System.out.println("Enter integer n: ");
		int n = new Scanner(System.in).nextInt();
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String elements = alphabet.substring(0, n);

		// using first implementation
		comb1(elements);
		System.out.println();
		// using second implementation
		comb2(elements);
		System.out.println();
	}

}