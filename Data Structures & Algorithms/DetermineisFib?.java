/*Sebas*/
//Determine whether a number is a fibonacci
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	
	private static long[]f = new long[92];
	
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println(number + " is" + (isFibonacci(number) ? " " : " is not ") + "a Fibonacci");
		
		System.out.println("\n               Fibonacci list");
		for(int i = 0; i < 30 + number; i++){
			System.out.print(fib(i) + " ");
		}
		
	}
	public static boolean isPerfectSquare(int input){
		int x = (int)Math.sqrt(input);
		return (int)Math.pow(x, 2) == input ? true : false;
	}
	public static boolean isFibonacci(int n){
		return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);  
	}
	public static long fib(int n){
		if( n < 2)
			return n;
		if(f[n] > 0)
			return f[n];
		f[n] = fib(n - 1) + fib(n - 2);
		return f[n];
	}
	
}