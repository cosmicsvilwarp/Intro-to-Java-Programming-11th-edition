/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;

class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		char[] word  = new Scanner(System.in).next().toCharArray();
		reverse(word);
		System.out.println(Arrays.toString(word));
	}
	public static void reverse(char[] word){
		int low = 0;
		int high = word.length - 1;
		reverse(word, low, high);
	}
	
	private static void reverse(char[]arr, int low, int high){
		if(low < high){
			char temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			reverse(arr, low + 1, high - 1);
		}
	}
}