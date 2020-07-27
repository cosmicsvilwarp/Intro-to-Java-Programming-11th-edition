/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

class PermutationsK {

	public static void choose(char[] a, int k) {
		enumerate(a, a.length, k);
	}

	private static void enumerate(char[] a, int n, int k) {
		if (k == 0) {
			System.out.println(Arrays.toString(a));
			return;
		}

		for (int i = 0; i < n; i++) {
			swap(a, i, n-1);
			enumerate(a, n-1, k-1);
			swap(a, i, n-1);
		}
	}  

	// helper function that swaps a[i] and a[j]
	public static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


	// sample client
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		System.out.println("Enter k: ");
		int k = input.nextInt();
		String elements = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char[] a = new char[n];
		for (int i = 0; i < n; i++)
			a[i] = elements.charAt(i);
		choose(a, k);
	}

}