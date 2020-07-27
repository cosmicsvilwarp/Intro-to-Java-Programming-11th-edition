/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

/*ArrayList and LinkedList both are List for storing a sequence of elements. The below demonstrates the performance of these two data structures.*/

class ArrayListvsLinkedList {
	static final int SIZE = 100000;
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		System.out.println("Insertion at Beginning:\n ");
		insertTest(list1, "Time for ArrayList is ");
		insertTest(list2, "Time for LinkedList is ");
		
		System.out.println("\n\n\nRetrieving element from a given index:\n");
		retrieveTest(list1, "Time for ArrayList is ");
		retrieveTest(list2, "Time for LinkedList is ");
		
		/*OBSERVATION: LinkedList is efficient of inserting and deleting elements at the beginning of a list and ArrayList is efficient for all other operations.*/

		
		
	}
	/*Function inserts 200,000 integers to the beginning of an ArrayList and a LinkedList. */
	public static void insertTest(List<Integer> list, String title){
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < SIZE ; i++){
			list.add(0, i);
		}
		long time = System.currentTimeMillis() - startTime;
		System.out.println(title + time + " milliseconds");
	}
	
	public static void retrieveTest(List<Integer> list, String title){
			long startTime = System.currentTimeMillis();
			for(int i = 0; i < SIZE; i++){
				list.get(new Random().nextInt(list.size()));
			}
			long time = System.currentTimeMillis() - startTime;
			System.out.println(title + time + " milliseconds");
		}
}