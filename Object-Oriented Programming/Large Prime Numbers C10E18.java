import java.math.*;
import java.util.*;

/*Sebas*/

//(Large prime numbers) Write a program that finds five prime numbers larger than Long.MAX_VALUE.
//import java.util.*;

class Untitled {
	public static void main(String[] args) {
		// Find five prime numbers larger than Long.MAX_VALUE
		BigDecimal num = new BigDecimal(Long.MAX_VALUE);
		final int NUMBER_OF_PRIMES = 5;
		int count = 0; //Counts number of primes
		
		System.out.println("The "+NUMBER_OF_PRIMES+" prime numbers larger than Long.MAX VALUE are: ");
		
		while(count < NUMBER_OF_PRIMES){
			num = num.add(BigDecimal.ONE);
			if(isPrime(num)){
				count++;
				System.out.println(count+": "+num + " ");
			}
		} 
	}
	
	/** Return true if number is prime */
	public static boolean isPrime(BigDecimal n){
		//readability: for(int k = 2; k < n/2 ; k++)
		for(BigDecimal k = new BigDecimal(2); (k.compareTo(n.divide(new BigDecimal(2))) > 0); k  = k.add(BigDecimal.ONE)) {
			if(n.remainder(k).equals(BigDecimal.ZERO)){
				return false;
			}
		}
		return true;
	}
}