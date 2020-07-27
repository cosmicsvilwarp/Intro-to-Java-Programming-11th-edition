/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Association<String, Integer> person = new Association<>("Ps5", 599);
		Transition<Integer,Integer, Integer> numbers = new Transition<>(new Integer(88), new Integer(90), new Integer(122));
		Transition<String,String,Double> country = new Transition<>("Haiti", "Sunny", new Double(92));
		
		System.out.println(person.toString());
		System.out.println(country.toString());
		
		System.out.println("\nThe sum of numbers is " + Transition.sum(numbers));
	}
}