/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1:");
		int n1 = input.nextInt();
		System.out.println("Enter number2:");
		int n2 = input.nextInt();
		System.out.println("The GCD is " + gcd(n1, n2));
	}
	public static int gcd(int x, int y){
		int dividend = x >= y ? x : y;
		int divisor= y <= x ? y : x;
		
		while(divisor != 0){
			int remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		return dividend;
	}
}