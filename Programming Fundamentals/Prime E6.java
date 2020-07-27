import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		int NUMBER_PRIME =500;
		int count = 0;
		int number = 3;
		while(count < NUMBER_PRIME)
		{
			count++;
			if(isPrime(number))
			{
				System.out.print(number + " ");
			}
			number++;
		}
	}
	
	public static boolean isPrime (int number){
		for(int k = 2 ; k <= number / 2; k++)
		{
			if (number % k == 0)
			{
				return false;//number is not a prime
			}
		}
		return true;
	}
}