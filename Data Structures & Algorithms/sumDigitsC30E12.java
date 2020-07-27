/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println("The sum is " + sumDigits(input.nextLong()));
	}
	public static int sumDigits(long n){
		String arr = n + "";
		return arr.chars().mapToObj(e -> e).mapToInt(e -> e - '0').sum();
	}
}