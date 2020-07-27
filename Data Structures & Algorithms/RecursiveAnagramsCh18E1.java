/*Sebas*/
/*(Identifying anagrams) Two words are anagrams of each other if they contain the same letters that are arranged in different orders. Write a recursive method that can identify if two given words are anagrams of each other.*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word1: ");
		char[]word1 = input.next().toCharArray();
		System.out.println("Enter word2: ");
		char[]word2 = input.next().toCharArray();
		int size = word1.length;
		
		
		System.out.println("The words are" + ((isAnagram(word1, word2))? " " : " not ") + "anagrams");
	}
	public static boolean isAnagram(char[]word1, char[]word2){
		int index = word1.length - 1;
		
		return isAnagram(word1, word2, index);
	}
	
	public static boolean isAnagram(char[]word1, char[]word2, int index){
		if(word1.length != word2.length || index == 0) return false;
		
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		boolean isSame = word1[index] == word2[index] ? true : false;
		
		isAnagram(word1, word2, index - 1);
		
		return isSame;
	}
}