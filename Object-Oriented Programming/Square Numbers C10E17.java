/*********************************************************************************
* (Square numbers) Find the first ten square numbers that are greater than       *
* Long.MAX_VALUE. A square number is a number in the form of n2. For example,    *
* 4, 9, and 16 are square numbers. Find an efficient approach to run your        *
* program fast.                                                                  *
*********************************************************************************/
/*Sebas*/
import java.util.*;
import java.math.*;

class Untitled {
	public static void main(String[] args) {
		BigDecimal longmaxvalue = new BigDecimal(Long.MAX_VALUE);
		long start = (long)Math.sqrt(Long.MAX_VALUE);
		BigDecimal num = new BigDecimal(start);
		int count = 0;
		
		while(count < 10){
			
			BigDecimal squared = num.multiply(num);
			if(squared.compareTo(longmaxvalue) > 0){
				count++;
				System.out.println(count+": " + num + " squared = " + squared);
			}
			num = num.add(BigDecimal.ONE);
		}
	}
}