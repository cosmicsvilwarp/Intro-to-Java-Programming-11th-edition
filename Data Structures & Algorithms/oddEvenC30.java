/*Sebas*/
//(The number of even numbers and odd numbers) Write a program that reads ten integers, and then display the number of even numbers and odd numbers. Assume that the input ends with 0. Here is the sample run of the program.
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		//Prompt user for input 
		System.out.println("Enter 10 numbers : ");
		
		int[]numbers = new int[10];
		int i = 0;
		for(int n : numbers)
			numbers[i++] = new Scanner(System.in).nextInt();
		
		//Get even and odd
		long even = IntStream.of(numbers).mapToObj(e -> e).filter(e -> e % 2 == 0).count();
		long odd = numbers.length - even; //if not even, it is odd
		
		System.out.println("The number of odd numbers : " + odd);
		System.out.println("The number of even numbers : " + even);
	}
}