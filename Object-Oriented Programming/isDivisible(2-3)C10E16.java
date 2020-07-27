/*********************************************************************************
* (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that   *
* are divisible by 2 or 3.                                                       *
*********************************************************************************/
/*Sebas*/
import java.util.*;
import java.math.*;

//(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
class Untitled {
	public static void main(String[] args) {
		//Create a number 
		String num = 1 +"";
		for(int i = 0; i < 49; i++){
			num += "0";
		}
		BigInteger number = new BigInteger(num);
		int count = 0;
		
		while(count < 10){
			number = number.add(BigInteger.ONE);
			if(isDivisible(number)){
				count++;
				System.out.println(count+": "+number);
			}
		}
		
	}
	//Returns true if Number is divisible by 2 or 3
	public static boolean isDivisible(BigInteger n){
		return n.remainder(new BigInteger(2 + "")).equals(BigInteger.ZERO) || n.remainder(new BigInteger(3+ "")).equals(BigInteger.ZERO);
	}
}