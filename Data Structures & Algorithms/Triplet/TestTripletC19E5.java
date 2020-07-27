/*Sebas*/
/*(Using wildcards) Write a generic static method that returns the smallest value 
	in an instance of Pair from Programming Exercise 19.3.*/
import java.io.*;
import java.net.*;
import java.util.*;



class TestTriplet  {
	public static void main(String[] args) {
		Triplet<Double> nums = new Triplet<>(new Double(88), new Double(33.88), new Double(45.10));
		System.out.print("The smallest value is " + Triplet.min(nums.getFirst(), nums.getSecond(), nums.getThird()));
		
		Triplet<String> str = new Triplet<>("Java", "Python", "C++");
		System.out.println("\n\n" + Triplet.max(str.getFirst(), str.getSecond(), str.getThird()));
	}
}