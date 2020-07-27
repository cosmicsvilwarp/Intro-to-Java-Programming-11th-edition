/*Sebas*/
//Find missing elements in a sorted array 
//Time Complexity: findMissing: O(N), findMissing2: O(N)
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		int[]numbers = {6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19};
		findMissing(numbers);
		System.out.println();
		findMissing2(numbers);
		
	}
	public static void findMissing(int[]a){
		System.out.println("(1st Version) Missing elements: ");
		int diff = a[0] - 0; //find difference of first value && index
		for(int i = 0; i < a.length; i++){
			if(a[i] - i != diff){ //if value - index does not equal diff, element is missing
				while(diff < a[i] - i){
					System.out.println(i + diff);
					diff++; //we Incresase diff everytime we encounter a missing element
				}
			}
		}
	}
	public static void findMissing2(int[]a){
		int low = a[0];
		int max = IntStream.of(a).max().getAsInt();//Find max in Array a
		
		//drawback of this method is the space it consumes as ensuing array has the size of the maximum value in array 'a'
		int[]H = new int[max + 1];
		
		
		for(int i = 0; i < a.length; i++){
			H[a[i]]++; //Increase index of H if exists in array 'a
		}//Missing elemetns will be the index with 0 values
		
		System.out.println("(2nd Version) Missing elements: ");
		for(int i = low ; i < H.length; i++){
			if(H[i] == 0)
				System.out.println(i);
		}
	}
	//Only works when dealing with natural numbers (1, 2, 3 ,4 ,... n)
	public static int missing(int[]a){
		
			int n = a.length + 1;
			int total = IntStream.of(a).reduce(Integer::sum).getAsInt();
			int actualTotal = n * (n + 1)/ 2;
			//we deduct the total values of array from natural number total n * (n + 1)/ 2;
			return (actualTotal - total);
	}
}