/*Sebas*/
/**
 * Chapter 11 Exercise 07:
 *
 *  (Shuffle ArrayList)
 *  Write the following method that shuffles the elements in an ArrayList of integers.
 *
 *  public static void shuffle(ArrayList<Integer> list)
 *
 * Created by Luiz Arantes Sa on 9/8/14.
 */
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < 20; i++){
			list.add(i);
		}
		System.out.println("Before Shuffle");
		for(Integer i : list)
			System.out.print(i+" ");
			
		shuffle(list);
			
		System.out.println("\n\nAfter Shuffle");
		for(Integer i : list)
			System.out.print(i+" ");
	}
	public static void shuffle(ArrayList<Integer>list){
		// simple solution
			//Collections.shuffle(list);

			// manual shuffle
		for(int i = 0; i < list.size(); i++){
			int rand = (int)(Math.random()*list.size());
			int temp = list.get(rand);
			list.set(rand, list.get(i));
			list.set(i, temp);
		}
	}
}