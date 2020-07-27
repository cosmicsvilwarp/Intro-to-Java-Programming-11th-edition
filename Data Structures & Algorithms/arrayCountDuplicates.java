/*Sebas*/
//Finding duplicates in sorted
//Find count of duplicates 
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		int[]array =  {3, 6, 8, 8, 10, 12, 15, 15, 15, 20, 20};
		findDups(array);
		//countDups(array);
		countDups2(array);
	}
	public static void findDups(int[]numbers){
		int lastDuplicate = 0;
		for(int i = 0; i < numbers.length - 1; i++){
			if(numbers[i] == numbers[i + 1] && numbers[i] != lastDuplicate){
				System.out.println(numbers[i]);
				lastDuplicate = numbers[i];
			}
		}
	}
	public static void countDups(int[]numbers){
		int j = 0;
		System.out.println("(1st version) Count dups: ");
		for(int i = 0; i < numbers.length - 1; i++){
			if(numbers[i] == numbers[i + 1]){
				j = i + 1;
				while(numbers[i] == numbers[j]){
					j++;
					System.out.println(numbers[i] + " appears " + (j - i) + " times");				
				} 
				i = j - 1;
			}
		}
	}
	public static void countDups2(int[]numbers){
		int[]H = new int[IntStream.of(numbers).reduce(Integer::sum).getAsInt()];
		
		for(int i = 0; i < numbers.length; i++){
				H[numbers[i]]++;
		}
		System.out.println("\n(2nd version) Count dups: ");
		for(int i = 0; i < H.length; i++){
			if(H[i] > 1)
				System.out.println(i + " : " + H[i] + " times");
		}
	}
}