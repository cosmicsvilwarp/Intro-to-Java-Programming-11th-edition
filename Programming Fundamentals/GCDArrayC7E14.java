/*********************************************************************************
* (Computing gcd) Write a method that returns the gcd of an unspecified number   *
* of integers. The method header is specified as follows:                        *
* public static int gcd(int... numbers)                                          *
* Write a test program that prompts the user to enter five numbers, invokes the  *
* method to find the gcd of these numbers, and displays the gcd.                 *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIZE = 5;
		System.out.println("Please enter " +SIZE+ " numbers:");
		int[] numbers = new int[SIZE];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = input.nextInt();
		}
	
	//***Print results****
	System.out.println("The min is " + getMin(numbers));
	System.out.println("The GCD is " + gcd(numbers));
	
	}
	
	/** Method gcd returns the gcd of an unspecified number of integers */
	public static int gcd(int...numbers){
		int gcd = 1;
		int min = getMin(numbers);
		boolean isDivisor;
		
		for( int k = 2 ; k <= min ; k++){
			isDivisor = true;
			for(int i = 0 ; i <= numbers.length -1 ; i++){
				if(numbers[i] % k != 0){
					isDivisor = false;
				}
				if(isDivisor)
					gcd = k;
				}
			}
		return gcd;	
	}
	public static int getMin(int[] array){
		int min = array[0];
		
		for(int i = 0;  i< array.length; i++){
			if(min > array[i]){
				min = array[i];
				}	
		}
		return min;
		}
}	
		
		
		
		/*for(k =2;  k <= n1 && k <= n2; k++){
			if(n1 % k == 0 && n2 %k ==0){
				gcd = k;
			}
		}
		System.out.println("\n the GCD is " + gcd);
	}
}*/