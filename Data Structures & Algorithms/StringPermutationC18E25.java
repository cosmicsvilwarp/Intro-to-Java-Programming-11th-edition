/*Sebas*/
/*(String permutation) Write a recursive method to print all the permutations of a string*/
//Non-duplicates
import java.io.*;
import java.net.*;
import java.util.*;

class Permutation {
	
	static int count = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		String word = new Scanner(System.in).next();
		displayPermutation(word);
		System.out.println("The count is " + count);
		
	}

	public static void displayPermutation(String full){
		displayPermutation(" ", full);
	}
	
	private static void displayPermutation(String prefix, String remaining){
		if(remaining.length() == 0){
			System.out.println(prefix);
			count++;
		}
		boolean[]alpha = new boolean[26]; //identify duplicates
		
			for(int i = 0; i < remaining.length(); i++){
				
				char ch = remaining.charAt(i);
				if (alpha[ch - 'a'] == false){
					//Only perform permutation on unique characters 
								displayPermutation(prefix + ch, remaining.substring(0, i) 
																+ remaining.substring(i + 1));
								alpha[ch - 'a'] = true;
			}
		}
	}
}