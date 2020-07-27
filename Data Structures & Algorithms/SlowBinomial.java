/*Sebas*/
/******************************************************************************
 *  Compilation:  javac SlowBinomial.java
 *  Execution:    java SlowBinomial 56 3
 *  
 *  Reads in two command-line arguments n and k and print the corresponding
 *  binomial coefficient n choose k using Pascal's indentity.
 *
 *        binomial(n, k) = binomial(n-1, k-1) + binomial(n-1, k)
 *
 *  % java Binomial 10 2
 *  45
 * 
 *  % java Binomial 20 0
 *  1
 * 
 *  % java Binomial 0 0      
 *  1                           // by definition
 *
 *  % java Binomial 50 20
 *  [ takes a really really really long time ]
 * 
 * 
 *  % java Binomial 100 15
 *  [ takes a really really really long time ]
 *
 *
 *  Remark
 *  ------------
 *  This program is to slow to be useful in practice.
 *  See Binomial.java, which uses dynamic programming.
 *
 ******************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class SlowBinomial {
	public static long binomial(long n, long k) {
		if (k == 0) return 1;
		if (n == 0) return 0;
		if (k == n) return 1;
		return binomial(n-1, k-1) + binomial(n-1, k);
	}
   
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		int n = new Scanner(System.in).nextInt();
		System.out.print("Enter k: ");
		int k = new Scanner(System.in).nextInt();
		System.out.println(binomial(n, k));
		for (int i = 0; true; i++) {
			long result = binomial(4*i, i);
			System.out.println(i + " " + result);
		}
	}
}
