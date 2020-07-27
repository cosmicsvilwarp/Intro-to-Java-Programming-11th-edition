/*Sebas*/
/*(Sort students) Rewrite Programming Exercise 7.17 using streams. Define a class named Student with data fields name and score and their getter meth- ods. Store each student in a Student object.*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;

class Demo {
	public static void main(String[] args) {
		//Get Student infos
		Student[]students = getStudents();
		
		//Display results
		Stream.of(students)
		.collect(Collectors.groupingBy(Student::getName, TreeMap::new, Collectors.averagingInt(Student::getScore)))
		.forEach((key, value) -> System.out.println(key + " " + value));
		
	}
	public static Student[] getStudents(){
		//Prompt user for input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number = input.nextInt();
		Student[]students = new Student[number];
		
		for(int i = 0; i < students.length; i++){
			System.out.println("Enter Student's " + (i + 1) + " name: ");
			String name = input.next();
			System.out.println("Enter Student's " + (i + 1) + " score: ");
			int score = input.nextInt();
			students[i] = new Student(name, score); 
		}
		return students;
	}
}
class Student {
	private String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
}