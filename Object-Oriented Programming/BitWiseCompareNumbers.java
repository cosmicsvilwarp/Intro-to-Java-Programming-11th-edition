/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

// Java program to check if two numbers 
// are equal without using arithmetic 
// and comparison operators 
class GFG { 
	public static void main(String[] args) { 

			areSame(10, 10); 
		} 
	
	public static void areSame(int a, int b) { 
		// Function to check if two 
			// numbers are equal using 
			// XOR operator 
		if ((a ^ b) != 0) 
			System.out.print("Not Same"); 
		else
			System.out.print("Same");
	}
}