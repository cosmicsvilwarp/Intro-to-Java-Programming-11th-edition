/*Sebas*/
import java.util.*;


class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("Enter list:");
			int[] list1 = new int[input.nextInt()];
			for (int i = 0; i < list1.length; i++) {
			 list1[i] = input.nextInt();
			}
			 
			partition(list1);
			 
			System.out.print("After the partition, the list is ");
			 
			for (int i = 0; i < list1.length; i++) {
			 System.out.print(list1[i] + " ");
			}
		 
		 }
			
		 public static int partition(int[] list) {
			int partition = list[0];
			int partitionLocation = 0;
			int hi = list.length-1;
			 
			while(partitionLocation < hi) {
				
			 if(partition>list[partitionLocation+1]) {
				//swap partition and the next item
				list[partitionLocation] = list[partitionLocation+1];
				list[partitionLocation+1] = partition;
				partitionLocation++;
			 } else {
				//move the item to the end of the list
				int temp = list[hi];
				list[hi]=list[partitionLocation+1];
				list[partitionLocation+1] = temp;
				hi--;
					 
			 }
			}
			 
			return partitionLocation;
			
		 }
		 
		}