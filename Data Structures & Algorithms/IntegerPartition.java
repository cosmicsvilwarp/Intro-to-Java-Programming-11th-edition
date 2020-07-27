/*Sebas*/
/*Print out all partitions of a positive integer N. In number theory,
 *  a partition of N is a way to write it as a sum of positive integers.
 *  Two sums that differ only in the order of their terms are considered
 *  the same partition.*/

import java.io.*;
import java.net.*;
import java.util.*;

class Partition { 
	
public static void partition(int n) {
		partition(n, n, "");
	}
	public static void partition(int n, int max, String prefix) {
		if (n == 0) {
			System.out.println(prefix);
			return;
		}
		
		for (int i = Math.min(max, n); i >= 1; i--) {
			partition(n-i, i, prefix + " " + i);
		}
	}


	public static void main(String[] args) { 
		System.out.print("Enter an integer: ");
		int n = new Scanner(System.in).nextInt();
		partition(n);
	}
}