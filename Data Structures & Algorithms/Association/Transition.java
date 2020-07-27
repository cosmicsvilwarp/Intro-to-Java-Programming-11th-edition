public class Transition<T, E, V> {
	private T value1;
	private E value2;
	private V value3;
	
	//Constructor
	Transition(T value1, E value2, V value3){
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	//Getters and setters
	public T getFirst(){
		return value1;
	}
	public E getSecond(){
		return value2;
	}
	public V getThird(){
		return value3;
	}
	public void setFirst(T value1){
		this.value1 = value1;
	}
	public void setSecond(E value2){
		this.value2 = value2;
	}
	public void setThird(V value3){
		this.value3 = value3;
	}
	public static int sum(Transition<Integer,Integer, Integer> nums){
		return nums.getFirst() + nums.getSecond() + nums.getThird();
	}
	@Override
	public String toString(){
		return value1 + " " + value2 + " " + value3;
	}
}