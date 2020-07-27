/*Sebas*/
/*(Perform set operations on priority queues) Given two stacks of textbooks of the following subjects {“Chemistry”, “Mathematics”, “Biology”, “English”} and {“Biology”, “English”, “Geography”, “Physics”}, find the subjects that are (1) only present in the first stack; (2) only present in the second stack; (3) present in both stacks.*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>(List.of("Chemistry", "Mathematics", "Biology", "English"));
		PriorityQueue<String> queue2 = new PriorityQueue<>(List.of("Biology", "English", "Geography", "Physics"));
		
		PriorityQueue<String>qt1 = new PriorityQueue<>(queue1);
		PriorityQueue<String>qt2 = new PriorityQueue<>(queue2);
		//Only present in the first stack
		qt1.addAll(qt2);
		qt1.removeAll(qt2);
		System.out.println("The Subjects only in the first stack: " + qt1);
		
		//Only present in the second stack
		qt2.addAll(queue1);
		qt2.removeAll(queue1);
		System.out.println("\n\nThe Subjects only in the second stack: " + qt2);
		
		//Present in both
		
		queue1.retainAll(queue2);
		System.out.println("\n\nThe Subjects in both: \n" + queue1);
		
	}
}