/*Sebas*/
//(Find the smallest element) Rewrite Programming Exercise 7.9 using streams.
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		//Prompt user for input
		Scanner input = new Scanner(System.in);
		double[]values = new double[10];
		System.out.println("Enter ten numbers: ");
		int i = 0;
		for(double n : values)
			values[i++] = input.nextDouble();
			
		//Display minimum	
		double minimum = DoubleStream.of(values).min().getAsDouble();
		System.out.println("The minimun number is " + minimum);
	}
}