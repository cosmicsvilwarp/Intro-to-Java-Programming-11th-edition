/*Sebas*/
//(Count the letters in a string) Rewrite Programming Exercise 6.20 using streams.
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		//Prompt user for input 
		System.out.println("Enter a String: ");
		String str = new Scanner(System.in).next();
		
		//DIsplay results
		System.out.println(str + ": " + countLetters(str));
	}
	//Function returns amount of letters in String
	public static int countLetters(String s){
		return (int)s.chars().count();
	}
}