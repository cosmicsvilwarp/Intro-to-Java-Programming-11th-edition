/*Sebas*/
/*Write a program which takes a nonnegative integer and returns the largest integer whose square is less than or equal to the given integer. For example, if the input is 16, return 4; if the input is 300, return 17, since 172 = 289 < 300 and 182 = 324 > 300.*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;

class EPI11E4 {
	public static void main(String[] args) {
		int n = 300;
		
		System.out.println(intSquareRoot(n));
		
		System.out.println(recursiveIntSquareRoot(n));
	}
	public static int intSquareRoot(int k){
		int low = 0; int high = k;
		while(low <= high){
			int mid = low + (high - low)/2;
			int midSquared = mid * mid;
			if(midSquared >= k){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return low - 1;
	}
	public static int recursiveIntSquareRoot(int k){
		return recursiveIntSquareRoot(k, 0, k);
	}
	public static int recursiveIntSquareRoot(int k, int low, int high){
		if(low >= high) return low - 1;
		int mid = low + (high - low)/2;
		int midSquared = mid * mid;
		if(midSquared >= k){
			return recursiveIntSquareRoot(k, low, mid - 1);
		}
		else{
			return recursiveIntSquareRoot(k, mid + 1, high);
		}
	}
}