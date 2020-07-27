/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		int[]numbers = {2, 5, 6, 8, 8, 2, 2, 4, 6};
		int size = numbers.length;
		
		System.out.println("The total is " + findCount(numbers, size));
	}
	public static int findCount(int[]numbers, int size){
		if(size == 0) return 0;
		int count = findCount(numbers, size - 1);
		
		if(numbers[size - 1] == 2) count++;
		return count;
	}
}