/*
(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
...
*/

/*Sebas*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		final int NUMBER_LINE = 10;
		final int COUNT = 100;
		int j = 2;
		int i = 2; 
		
		//Display thefirst Emirps
	System.out.println("The first 100 Emirps are: \n");	
	
		while(j <= COUNT)
		{
			if(isEmirp(i))
			{
				j++; //Increment j
				System.out.print((i % NUMBER_LINE == 0) ? i + "\n" : i + " ");
			}
			i++; //Increment i
		}
	}
	public static boolean isPrime(int n){
		
		for (int k = 2 ; k < n/2 ; k++)
		{
			if (n % k == 0)//If true, number is not prime
				return false;
		}
		return true;//Otherwise number is prime
	}
	
	public static int reverse (int n){
		int reversed = 0;
		//Reverse integer
		while (n != 0)
		{
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /=10;
		}
		return reversed;//return the reverse of the integer 
	}
	
	public static boolean isPalindrome (int n){
		//if reverse of the integer equals the integer, return true. Otherwise return false
		return ((reverse(n) == n) ? true : false);
	}
	public static boolean isEmirp(int n){
		//While not being a palindrome, if the number n is prime and the reverse of that integer n is also a prime therefore that number n is an Emirp
		return isPrime(n) && isPrime(reverse(n)) && !isPalindrome(n);
	}
}