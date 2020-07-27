/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

class testPairs {
	public static void main(String[] args) {
		Pair<String> boys = new Pair<>("Seb", "Ludgi");
		Pair<String> girls = new Pair<>("Lea", "Francesca");
		
		System.out.println("The boy's name are " + boys.toString());
		System.out.println("\nThe second girl's name is " + girls.getSecond());
	}
}