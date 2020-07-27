/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		int[]numbers = {15, -4, 56, 10, -23};
		int size = numbers.length;
		
		
		System.out.println("The sum is " + totalSum(numbers, size));
	}
	public static int totalSum(int[]numbers, int size){
		if(size == 0) return 0;
		
		int lastElement = numbers[size - 1];
		
		int allButLastElement = totalSum(numbers, size - 1);
		
		return lastElement + allButLastElement;
	}
}