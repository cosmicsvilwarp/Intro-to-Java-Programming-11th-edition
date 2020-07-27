/*Sorted Search, No Size: You are given an array-like data structure Listy which lacks a size method. It does, however, have an elementAt (i) method that returns the element at index i in 0(1) time. If i is beyond the bounds of the data structure, it returns - 1. (For this reason, the data structure only supports positive integers.) Given a Listy which contains sorted, positive integers, find the index at which an element x occurs. If x occurs multiple times, you may return any index.*/
class Listy{
	int[]list;
	
	public Listy(int x){
		list = new int[10];
		for(int i = 0; i < list.length; i++, x+=2){
			list[i] = x;
		}
	}
	public int elementAt(int i){
		if(i > list.length - 1){
			return -1;
		}
		else{
			return list[i];
		}
	}
	public void print(){
		for(int n : list)
			System.out.print(n + "  ");
		System.out.println();
		System.out.println();
	}  
}
class CKI10E4{
	public static void main(String[] args) {
		Listy list = new Listy(3);
		list.print();
		
		System.out.println("Position: " + search(list, 21));
		
	}
	public static int search(Listy list, int value){
		//we know that if we surpass the array bounds, it will return -1
		//simultaneously we are not interested in any values above the one we are looking for
		int index = 1;
		while(list.elementAt(index) != -1 && list.elementAt(index) < value){
			index *= 2; //to maintain logarithmic time, we increase by 2
		}
		return binarySearch(list, value, index/2, index); 
	}//we pass index/2 for low as our loop ensures that value > list[index/2]
	public static int binarySearch(Listy list, int value, int low, int high){
		int mid;
		while(low <= high){
			mid = low + (high - low)/2;
			int midElement = list.elementAt(mid);
			if(midElement == value){
				return mid;
			}
			else if(midElement > value || midElement == -1){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return -1;
	}
}
			