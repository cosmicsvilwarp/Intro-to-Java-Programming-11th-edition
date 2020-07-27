/*(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For exam- ple, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. Write a program to find all twin primes less than 1,000. Display the output as follows:
(3, 5) 
(5, 7)
*/

/*Sebas*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		final int NUMBER_LINE = 10;
		final int MAX = 1000;
		int j = 2;
		int i = 2; 
		
		//Display thefirst Emirps
	System.out.println("The first 100 Emirps are: \n");	
	
		while(i <= MAX)
		{
			i++;
			if(istwinPrime(i))
			{
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
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
	/** Method isTwinprime returns true if num and num + 2 are primes */
	public static boolean istwinPrime (int n){
		return isPrime(n) && isPrime(n + 2);
	}
}