/*Sebas*/
/*(Use iterators on ArrayList) Write a test program that stores 10 million integers in ascending order (i.e., 1,2, . . ., 10m) in an ArrayList, displays the execution time taken to traverse the list, and searches for the 10 millionth element using the get(index) vs using the iterator method.*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	
	static ArrayList<Integer> list = new ArrayList<>();
	final static int NUMBER =10000000;
	
	public static void main(String[] args) {
		insert();
		getN();
		iterateN();
		
	}
	public static void insert(){
		long start = System.currentTimeMillis();
		for(int i = 1; i <= NUMBER; i++){
			list.add(i);
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("Insert: " + time + " milliseconds");
	}
	public static void getN(){
		long start = System.currentTimeMillis();
		list.get(NUMBER - 1);
		long time = System.currentTimeMillis() - start;
		System.out.println("getMethod: " + time + "milliseconds");
	}
	public static void iterateN(){
		long start = System.currentTimeMillis();
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			if(iterator.next() == NUMBER);
				break;
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("Iterate: " + time + "milliseconds");
	}
}