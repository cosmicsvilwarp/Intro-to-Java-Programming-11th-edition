public class Triplet<E> {
	private E value1;
	private E value2;
	private E value3;
	
	//Constructor
	Triplet(E value1, E value2, E value3){
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	//Getters and Settors
	public E getFirst(){
		return value1;
	}
	
	public E getSecond(){
		return value2;
	}
	
	public E getThird(){
		return value3;
	}
	
	public void setFirst(E value1){
		this.value1 = value1;
	}
	
	public void setSecond(E value2){
		this.value2 = value2;
	}
	
	public void setThird(E value3){
		this.value3 = value3;
	}
	
	public static <E extends Comparable<E>> E min(E o1, E o2, E o3){
		if (o1.compareTo(o2) < 0 && o1.compareTo(o3) < 0)
			return o1;
		else if (o2.compareTo(o1) < 0 && o2.compareTo(o3) < 0)
			return o2;
		else 
			return o3;
	}
	
	public static <E extends Comparable<E>> E max(E o1, E o2, E o3){
		if (o1.compareTo(o2) > 0 && o1.compareTo(o3) > 0)
			return o1;
		else if (o2.compareTo(o1) > 0 && o2.compareTo(o3) > 0)
			return o2;
		else 
			return o3;
	}
	
	@Override
	public String toString(){
		return value1 + " " + value2 + " " + value3;
	}
}