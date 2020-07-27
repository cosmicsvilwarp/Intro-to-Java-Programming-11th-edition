/*(Pair of objects of the same type) Create a Pair class that encapsulates two objects of the same data type in an instance of Pair.*/
public class Pair<E> {
	private E obj1;
	private E obj2;
	
	Pair(E obj1, E obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void setFirst(E obj1){
		this.obj1 = obj1;
	}
	public void setSecond(E obj2){
		this.obj2 = obj2;
	}
	public E getFirst(){
		return obj1;
	}
	public E getSecond(){
		return obj2;
	}
	public static <E extends Comparable<E>> E min(E o1, E o2){
		return o1.compareTo(o2) < 0 ? o1: o2;
	}
	@Override
	public String toString(){
		return  obj1 + " and " + obj2;
	}
}