import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		int PRIME_NUMBERS = 50;
		int NUMBERS_LINE = 10;
		int count = 0; 
		int number = 2;
		
		System.out.println("The first 50 prime numbers are \n");
		//Repeatedly find prime numbers
		while(count < PRIME_NUMBERS)
		{//Assume the number is prime
			Boolean isprime = true;
			//Test whether number is prime
			for (int k = 2 ; k <= number/2 ; k++)
			{
				if(number % k == 0)// If true, number is not prime
				{
					isprime = false; //set isprime to false
					break; //exit the for loop
				}
			}
			//Display the prime number and increase the count 
		if(isprime)
		{
			count++;
			if(count % NUMBERS_LINE == 0)
			{//Dispaly a number and advance tothe new line
				System.out.print(number + "  " );
			}
			else
			{
				System.out.print(number + "  ");
			}
		}
		//Check if the next number is prime 
		number++;
		}
	}
}