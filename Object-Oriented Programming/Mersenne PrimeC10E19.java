/*********************************************************************************
* (Mersenne prime) A prime number is called a Mersenne prime if it can be        *
* written in the form 2p - 1 for some positive integer p. Write a program that   *
* finds all Mersenne primes with p … 100 and displays the output as shown below. *
* (Hint: You have to use BigInteger to store the number, because it is too big   *
* to be stored in long. Your program may take several hours to run.)             *
*********************************************************************************/
/*Sebas*/
import java.util.*;
import java.math.*;

class Untitled {
	public static void main(String[] args) {
		final int LIMIT_P = 100;
		int count = 0;
		int i = 2;
		
		//// Display all Mersenne primes with p < 100
		System.out.println("p       2^p - 1");
		while(i < LIMIT_P){
			i++;
			if(isPrime(i)){
				count++;
				System.out.printf("%-3d", i);
				System.out.println("       " + getMersennePrime(i));
			}
		}
	}
	
	///** Check whether number is prime */
	public static boolean isPrime(int n){
		for(int k = 2; k < (long)(Math.sqrt(n)); k++){
			if(n % k == 0){
				return false;
			}
		}
		return true;
	}
	/** Method mersennePrime finds and returns the mersenne prime of n */
	public static BigDecimal getMersennePrime(int p){	
			return (new BigDecimal(2).pow(p)).subtract(BigDecimal.ONE);
	}
}