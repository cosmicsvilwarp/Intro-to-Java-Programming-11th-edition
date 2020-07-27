/*Sebas*/
/*(Using wildcards) Write a generic static method that returns the smallest value in an instance of Pair from Programming Exercise 19.3.*/
//Implements Min in Pair Class, implements Max in main
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Pair<Integer> numbers = new Pair<>(28, 88);
		Integer min = Pair.min(numbers.getFirst(), numbers.getSecond());
		System.out.println("The smallest value is " + min);
		System.out.println("The max value is " + max(numbers));

	}
	public static <E extends Comparable<E>> E max(Pair<E> num){
		if(num.getFirst().compareTo(num.getSecond()) > 0)
			return num.getFirst();
		else
			return num.getSecond();
	}
}