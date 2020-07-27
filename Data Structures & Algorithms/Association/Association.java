public class Association<T, E> {
	private T value1;
	private E value2;
	
	//Constructor
	Association(T value1, E value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	//Getters and setters
	public T getFirst(){
		return value1;
	}
	public E getSecond(){
		return value2;
	}
	public void setFirst(T value1){
		this.value1 = value1;
	}
	public void setSecond(E value2){
		this.value2 = value2;
	}
	@Override
	public String toString(){
		return value1 + " " + value2;
	}
}