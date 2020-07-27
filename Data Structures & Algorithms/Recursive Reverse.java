/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		String word  = new Scanner(System.in).next();
		System.out.println(reverse(word));
	}
	public static String reverse(String word){
		if(word == null || word.length() <= 1)
			return word;
			
		return reverse(word.substring(1)) + word.charAt(0);
	}
}