/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		String str = new Scanner(System.in).next();
		permute(str);
	}
	
	public static void permute(String str){
		permute(" ", str);
	}
	private static void permute(String prefix, String remaining){
		if(remaining.length() == 0)
			System.out.println(prefix);
			
		for(int i = 0; i < remaining.length(); i++){
			char c = remaining.charAt(i);
			String ros = remaining.substring(0, i) + remaining.substring(i + 1);
			permute(prefix + c, ros);
		}
	}
}
	
