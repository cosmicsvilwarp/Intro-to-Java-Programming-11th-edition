import java.util.*;

/*Sebas*/
/*(Create Stack from list) Define a class MyStack that extends Stack to be able to have its constructor use a list of objects instead of pushing each object individually.*/
class MyStack<E> extends Stack<E> {
	ArrayList<E> list = new ArrayList<E>();
	
	MyStack(){
		
	}
	MyStack(ArrayList<E> list){
		this.list = list;
	}
	public E peek(){
		return list.get(list.size() - 1);
	}
	public void push(ArrayList<E> list2){
		list.addAll(list2);
	}
	public E pop(){
		E o = list.get(list.size() -1);
		list.remove(list.size() - 1);
		return o;
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	@Override
	public String toString(){
		return list.toString();
	}
}
class Untitled{
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>(List.of("Seb", "Lea", "Ludgi", "BLM"));
		ArrayList<Integer> ints = new ArrayList<>();
		for(int i = 0; i < 6; i++)
			ints.add(new Random().nextInt(100));
		
		MyStack<String> stack1 = new MyStack<>(name);
		System.out.println(stack1.toString());
		
		MyStack<Integer> stack2 = new MyStack<Integer>();
		stack2.push(ints);
		System.out.println(stack2.toString());
		System.out.println(stack2.peek());
		
	}
}
