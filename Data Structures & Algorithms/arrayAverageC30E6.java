/*Sebas*/
/*(Average an array) Rewrite Programming Exercise 7.8 using streams.*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;

class Demo {
	public static void main(String[] args) {
		int[] intValues = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		double[] doubleValues = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};
		
		//Display Average for double[]array
		System.out.println("double: " + average(doubleValues));
		//Display Average for int[]array
		System.out.println("\nint: " + average(intValues));
	}
	public static int average(int[]array){
		return (int)(IntStream.of(array).average().getAsDouble());
	}
	public static double average(double[]array){
		return DoubleStream.of(array).average().getAsDouble();
	}
}