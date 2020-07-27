/*Sebas*/
/*(Smallest element in ArrayList) Write the following method that returns the
smallest element in an ArrayList:  public static <E extends Comparable<E>> E min(ArrayList<E> list)*/

import java.io.*;
import java.net.*;
import java.util.*;

class sortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(20);
		list.add(67);
		list.add(96);
		list.add(10);
		
		//Diswplay
		System.out.println("ArrayList: \n");
		System.out.println(list.toString());
		
		//Display results
		System.out.println("\nThe smallest element: "+ min(list));
	}
	
	/*Function returns smallest element*/
	public static <E extends Comparable<E>> E min(ArrayList<E> list){
		E smallest = list.get(0);
		for(int i = 0; i < list.size(); i++){
			if(smallest.compareTo(list.get(i)) > 0)
				smallest = list.get(i);
		}
		return smallest;
	}
}