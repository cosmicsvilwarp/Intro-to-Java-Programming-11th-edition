/*Sebas*/
//(Remove Consecutive Integers) Write a program that reads 10 integers and displays them in the reverse of the order in which they were read. If two con- secutive numbers are identical, then only display one of them. Implement your program using only stack and not arrays or queues.
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> vals = new Stack<>();
		Stack<Integer> nondup = new Stack<>();
		
		//Insert inputs
		System.out.println("Enter a number: ");
		while(vals.size() < 8){
			vals.push(input.nextInt());
		}
		
		//Display reverse
		System.out.println();
		while(!vals.isEmpty()){
			int popped = vals.pop();
			if(!nondup.contains(popped))
			nondup.push(popped);
		}
		nondup.forEach(e -> System.out.println(e));
	}
}