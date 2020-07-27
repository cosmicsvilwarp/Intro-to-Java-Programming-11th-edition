/*********************************************************************************
* (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE   *
* that are divisible by 5 or 6.                                                  *
*********************************************************************************/
/*Sebas*/
import java.util.*;
import java.math.*;

class Untitled {
	public static void main(String[] args) {
		BigDecimal start = new BigDecimal(Long.MAX_VALUE);
		int count = 0;
		System.out.println("The first "+NUMBERS+ " numbers are: ");
		
		while(count < 10){
			start = start.add(BigDecimal.ONE);
			if(isDivisible(start)){
				count++;
				System.out.println(count+": "+start + " ");
			}
		}
	}
	
	//**isDivisible return true if divisible by 5 or 6
	public static boolean isDivisible(BigDecimal number){
		return (number.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) || number.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO));
	}
}