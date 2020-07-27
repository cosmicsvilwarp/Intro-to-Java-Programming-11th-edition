/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int[]array1 = new int[5];
		int[]array2 = new int[5];
		
		for(int i = 0 ; i < 5; i++){
			array1[i] = i;
		}
		for(int i = 0 ; i < 5; i++){
			array2[i] = i + 10;
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		int[]temp = merge(array1, array2);
		
		System.out.println(Arrays.toString(temp));
		
	}
	public static int[] merge(int[]array1, int[]array2){
		int[]array3 = new int[array1.length + array2.length];
		
		for(int i = 0, j = 0; i < array3.length; i++){
			//Iterates through Array1
			if(i < array1.length){
				array3[i] = array1[i];
			}
			//Iterates through Array2
			else {
				array3[i] = array2[j];
				j++;
			}
		}
		return array3;
	}
}