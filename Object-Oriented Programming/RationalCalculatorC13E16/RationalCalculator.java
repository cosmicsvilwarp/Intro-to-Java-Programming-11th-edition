/*Sebas*/
/*********************************************************************************
* (Create a rational-number calculator) Write a program similar to Listing 7.9,  *
* Calculator.java. Instead of using integers, use rationals, as shown in Figure  *
* 13.10a. You will need to use the split method in the String class, introduced  *
* in Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator *
* string and denominator string, and convert strings into integers using the     *
* Integer.parseInt method.                                                       *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		if(args.length <= 1){
			System.out.println("Usage: Operand1 Operator Operand2");
			System.exit(0);
		}
		
		//Extracting numbers from Argument inputs
		int[]number1 = convertToInt(args[0].split("/"));
		int[]number2 = convertToInt(args[2].split("/"));
		int numerator1 = number1[0];
		int denominator1 = number1[1];
		int numerator2 = number2[0];
		int denominator2 = number2[1];
		
		// Create two Rational objects
		Rational r1 = new Rational(numerator1, denominator1);
		Rational r2 = new Rational(numerator2, denominator2);
	

		//Retrieve Operand - (Perform operation)
		switch(args[1].charAt(0)){
			case '+' : System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
						break; 
			case '-' : System.out.println(r1 + " + " + r2 + " = " + r1.subtract(r2));
						break; 
			case '*' : System.out.println(r1 + " + " + r2 + " = " + r1.multiply(r2));
						break; 
			case '/' : System.out.println(r1 + " + " + r2 + " = " + r1.divide(r2));
						break; 
			default : System.out.println("Illegal Argument: + - . /"); 
									System.exit(0);
		}
	}
	public static int[]convertToInt(String[]str){
		int i = 0;
		int[]num = new int[str.length];
		for(String e : str){
			num[i++] = Integer.parseInt(e);
		}
		return num;
	}
}
			