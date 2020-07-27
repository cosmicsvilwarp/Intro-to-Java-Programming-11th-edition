/*Sebas*/
/*The tribonacci numbers are similar to the Fibonacci numbers, except that each term is the sum of the three previous terms in the sequence. The first few terms are 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81. Write a program to compute tribonacci numbers. What is the ratio successive terms? Answer. Root of x^3 - x^2 - x - 1, which is approximately 1.83929.*/
import java.io.*;
import java.net.*;
import java.util.*;

class test { 
	
	public static long trib(int n) {
		long[]f = new long[n + 1];
		f[0]= 0;
		f[1] = 0;
		f[2] = 1;
		for(int i = 3; i <= n; i++){
			f[i] = f[i - 1] + f[i - 2] + f[i - 3];
		}
		return f[n];
	}
	
	public static void main(String[] args) { 
		System.out.print("Enter an integer: ");
		int n = new Scanner(System.in).nextInt();
		for(int i = 3; i < n; i++){
			System.out.print(trib(i) + " ");
		}
	}
}