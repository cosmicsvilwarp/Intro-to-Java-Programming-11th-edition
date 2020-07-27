/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("PS5");
		list.add("games");
		list.add("Fifa21");
		list.add("Technology");
		
		System.out.println("Before Shuffle: \n");
		System.out.println(list);
		
		System.out.println("\nAfter Shuffle: \n");
		shuffle(list);
		System.out.println(list);
	}
	public static <E> void shuffle(ArrayList<E>list){
		for(int i = 0; i < list.size(); i++){
			int rand = new Random().nextInt(list.size());
			E temp = list.get(rand);
			list.set(rand, list.get(i));
			list.set(i, temp);
		}
	}
}