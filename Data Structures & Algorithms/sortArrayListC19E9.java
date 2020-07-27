/*Sebas*/
/*(Sort ArrayList) Write the following method that sorts an ArrayList: public static <E extends Comparable<E>>
void sort(ArrayList<E> list)*/
import java.io.*;
import java.net.*;
import java.util.*;

class sortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(20);
		list.add(67);
		list.add(96);
		list.add(10);
		
		//Before sorting the list
		System.out.println("Before sorting: \n");
		System.out.println(list.toString());
		
		//Display results after sorting
		System.out.println("\nAfter sorting: \n");
		sort(list);
		System.out.println(list.toString());
	}
	
	/*Sort in increasing order*/
	public static <E extends Comparable<E>> void sort(ArrayList<E> list){
		E min;
		int minIndex;
		for(int i = 0; i < list.size() - 1; i++){
			min = list.get(i);
			minIndex = i;
			for(int j = i + 1; j < list.size(); j++){
				if(min.compareTo(list.get(j)) > 0){
					min = list.get(j);
					minIndex = j;
				}
			}
			if(minIndex != i){
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
	}
}