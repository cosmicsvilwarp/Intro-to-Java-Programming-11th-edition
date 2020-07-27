/*Sebas*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		final int NUMBER_LINE = 10;
		int i = 2; 
		final int COUNT = 100;
		int j  = 2;
		
		while(j <= COUNT)
		{
			if(isPrime(i) && isPalindrome(i))
			{
				j++;
				System.out.print((i % NUMBER_LINE == 0) ? i + "\n" : i + " ");
			}
			i++;
		}
	}
	
	public static boolean isPrime(int n){
		
	int k = 2;
		
		for (k = 2 ; k < n/2 ; k++)
		{
			if (n % k == 0)
				return false;
		}
		return true;
	}
	
	public static int reverse (int n){
		int reversed = 0;
		while (n != 0)
		{
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /=10;
		}
		return reversed;
	}
	public static boolean isPalindrome (int n){
		return ((reverse(n) == n) ? true : false);
	}
}
