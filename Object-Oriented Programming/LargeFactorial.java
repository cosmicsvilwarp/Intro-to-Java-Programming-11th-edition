/*Sebas*/
import java.util.*;
import java.math.*;

class LargeFactorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = input.nextInt();
		 System.out.println(n+"! is \n" + factorial(n));
	}
	
	public static BigInteger factorial(long n) {
		// BigInteger.ONE is a constant defined in the bigInteger class
		BigInteger result = BigInteger.ONE;
//        BigInteger result = new BigInteger("1");
		while(n > 0) {
			// Should convert 'i' to String format
			result = result.multiply(new BigInteger(String.valueOf(n)));
			// result = result.multiply(new BigInteger(i + ""));
			n--;
		}
		return result;
	}
}
