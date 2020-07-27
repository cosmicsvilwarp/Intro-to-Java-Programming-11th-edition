/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		char[]word = new Scanner(System.in).next().toCharArray();
		permutation(word);
	}
	public static void permutation(char[]word){
		int low = 0;
		int high = word.length;
		permutation(word, low, high);
	}
	private static void permutation(char[]word, int low, int high){
		if(low >= high)
			System.out.println(Arrays.toString(word));
			
			for(int i = low; i < high; i++){
				swap(word, low, i);
				permutation(word, low + 1, high);
				swap(word, low, i);
			}
	}
	
	private static void swap(char[]arr, int i, int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}