/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[][]list = new int[20][20];
		
		for(int i = 0 ; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				list[i][j] = i+j;
			}
		}
		System.out.println("Before shuffle: ");
		print(list);
		
		shuffle(list);
		
		System.out.println("\nAfter shuffle: ");
		print(list);
	}
	public static void shuffle(int[][]list){
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				int rand1 = (int)(Math.random()*list.length);
				int rand2 = (int)(Math.random()*list.length);
				int temp1 = list[i][rand1];
				int temp2 = list[rand2][j];
				list[i][rand1] = list[i][0];
				list[j][rand2] = list[0][j];
				list[i][0] = temp1;
				list[0][j] = temp2;
			}
		}
		
	}
	public static void print(int[][]m){
		for(int[]i : m)
			System.out.println(Arrays.toString(i));
	}
}