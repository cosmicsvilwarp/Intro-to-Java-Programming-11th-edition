/*Sebas*/
/*********************************************************************************
*(Average ArrayList) Write the following method that averages an ArrayList of    *
* integers:                                                                      *
* public static void average(ArrayList<Integer> list)                            *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Please enter input ");
		
		for(int i = 0; i < 4; i++){
			list.add(input.nextInt());
		}
		average(list);
		
	}
	public static void average(ArrayList<Integer> list){
		int sum = 0;
		for(int e : list){
			sum += e;
		}
		System.out.println("The average is " + (sum / list.size()));
	}
}