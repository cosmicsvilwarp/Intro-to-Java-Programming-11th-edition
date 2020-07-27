/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//	System.out.println("Enter the number of students: ");
	//	int number = input.nextInt();
		int[]scores = {78, 85, 92, 78};
		int best = IntStream.of(scores).max().getAsInt();
		Map<Integer,Character> map = new HashMap<>();
		for(int e : scores)
			map.put(e, getGrade(e, best));
			
			
		//map.forEach((key, value) -> System.out.println(key + " " + value));
		map.forEach((key, value) -> System.out.println(key + " " + value));
		
	}
		
		
	public static Character getGrade(Integer score, int best){
		return score >= best - 5 ? 'A' : score >= best - 10 ? 'B': 
				score >= best - 15 ? 'C' : score >= best - 20 ? 'D': 'F';
	}
}