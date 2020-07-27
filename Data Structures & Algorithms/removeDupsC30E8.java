/*Sebas*/
/*(Eliminate duplicates) Rewrite Programming Exercise 7.15 using streams and sort the elements in the new array in increasing order.*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		int[]numbers = new int[10];
		int i = 0;
		for(int n : numbers)
			numbers[i++] = input.nextInt();
		
		//Print results
		System.out.println(Arrays.toString(eliminateDuplicates(numbers)));	
	}
	public static int[] eliminateDuplicates(int[] list){
		return IntStream.of(list).distinct().sorted().toArray();
	}
}