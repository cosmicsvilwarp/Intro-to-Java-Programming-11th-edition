/*Sebas*/
/*(Perform set operations on hash sets) Given two stacks of textbooks of the following subjects 5"Chemistry", "Mathematics", "Biology", "English" 6 and 5"Biology", "English", "Geography", "Physics" 6 respectively, find the subjects that are (1) only present in the first stack; (2) only present in the second stack; (3) present in both stacks. (You may clone the sets to preserve the original sets from being changed by set methods.)*/
import java.io.*;
import java.net.*;
import java.util.*;



class Exercise_01 {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>(List.of("Chemistry", "Mathematics", "Biology", "English"));
		HashSet<String> set2 = new HashSet<>(List.of("Biology", "English", "Geography", "Physics"));
		
		HashSet<String> temp1 = (HashSet<String>)(set1.clone());
		HashSet<String>temp2 = (HashSet<String>)(set2.clone());
		
		//Only present in the first stack
		temp1.addAll(temp2);
		temp1.removeAll(temp2);
		System.out.println("\nOnly in the 1st stack: " + temp1);
		
		//Only present in the second stack
		temp2.addAll(temp1);
		temp2.removeAll(set1);
		System.out.println("\nOnly in the 2nd stack: " + temp2);
		
		//Present in both stacks
		set1.retainAll(set2);
		System.out.println("\nPresent in both stacks: " + set1);
		
		
		
	}
}