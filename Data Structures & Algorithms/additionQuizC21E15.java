/*Sebas*/
//(Addition quiz) Rewrite Programming Exercise 11.16 to store the answers in a set rather than a list.
import java.io.*;
import java.net.*;
import java.util.*;

class AdditionQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		while(number1 + number2 != answer){
			if(set.contains(answer)){
				System.out.println("You already entered " + answer);
			}
			else{
				System.out.println("Wrong answer. What is " + number1 + " + " + number2 + "? ");
				set.add(answer);
				}
				answer = input.nextInt();
		}
		System.out.println("You got it");
	}
}