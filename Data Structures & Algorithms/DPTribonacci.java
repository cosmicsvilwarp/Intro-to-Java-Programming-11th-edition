/*Sebas*/
/*The tribonacci numbers are similar to the Fibonacci numbers, except that each term is the sum of the three previous terms in the sequence. The first few terms are 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81. Write a program to compute tribonacci numbers. What is the ratio successive terms? Answer. Root of x^3 - x^2 - x - 1, which is approximately 1.83929.*/

import java.io.*;
import java.net.*;
import java.util.*;

class test { 
	
	private static long[]f = new long[99];
	//Top-down DP approach
	public static long trib(int n) {
		if(n < 2) return 0;
		else if(n < 4) return 1;
		if(n == 4) return 2;
		if(n == 5) return 4;
		if(f[n] > 0) return f[n];
		f[n] = trib(n - 1) + trib(n - 2) + trib(n - 3);
		return f[n];
	}
	
	public static void main(String[] args) { 
		System.out.print("Enter an integer: ");
		int n = new Scanner(System.in).nextInt();
		try{
			for(int i = 3; i < n; i++){
				System.out.print(trib(i) + " ");
			}
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("\n\nPlease increase size of Array to (n) !!");
		}
		
	}
}