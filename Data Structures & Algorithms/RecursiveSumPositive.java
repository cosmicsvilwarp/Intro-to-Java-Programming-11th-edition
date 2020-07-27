/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

/*Write a function to compute the sum of just the positive numbers in an array of integers.*/


class Untitled {
	public static void main(String[] args) {
		int[]numbers = {15, -4, 56, 10, -23};
		int size = numbers.length;
		
		System.out.println("The total sum for positives is " + sumPositive(numbers, size));
	}
	public static int sumPositive(int[]numbers, int size){
		if(size == 0) return 0;
		
		int lastElement = numbers[size - 1] > 0 ? numbers[size - 1] : 0;
		
		int allButLastElement = sumPositive(numbers, size - 1);
		
		return lastElement + allButLastElement;
	}
}