/*Sebas*/
/*(Occurrences of a specified character) Rewrite Programming Exercise 6.23 using streams.*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("****Occurrences of a specified character in a String****");
		System.out.print("\nEnter a String: ");
		String str = input.next();
		System.out.print("\nEnter Character: ");
		char ch = input.next().charAt(0);
		System.out.println("(" + str + ", " + ch + ")" + " : " + count(str, ch));
	}
	public static int count(String str, char a){
		return (int)str.chars().filter(e -> e == a).count();
	}
}