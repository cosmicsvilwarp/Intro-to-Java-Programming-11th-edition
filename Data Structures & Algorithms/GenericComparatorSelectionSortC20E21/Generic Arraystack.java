class MyStack<E> {
	int CAPACITY = 3;
	E[]stack = (E[])new Object[CAPACITY];
	private static int size;
	
	public void push(E data){
		ensureCapacity();
		
		stack[size++] = data;
	}
		
	public void ensureCapacity(){
		
		if(size >= stack.length){
			E[]temp = (E[])new Object[CAPACITY <<= 2 + 1];
			System.arraycopy(stack, 0, temp, 0, size);
			stack = temp;
		}
	}
	public E pop(){
		E item = stack[--size];
		stack[size] = null;
		trimToSize();
		return item;
	}
	public E peek(){
		return stack[size - 1];
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	public int length(){
		return stack.length;
	}

	public void trimToSize(){
		if(stack.length > size() * 4){
			E[]temp = (E[])new Object[size];
			System.arraycopy(stack, 0, temp, 0, size);
			stack = temp;
		}
	}
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < size; i++){
			result.append(stack[i]);
			if(i < size - 1)
				result.append(", ");
		}
		return result.toString();
	}
}
class test{
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		stack.push(34);
		stack.push(55);
		stack.push(12);
		stack.push(10);
		stack.push(34);
		stack.push(55);
		stack.push(12);
		stack.push(10);
		stack.push(12);
		stack.push(10);
		System.out.println(stack.length());
		System.out.println();
		System.out.println(stack.toString());
		System.out.println(stack.peek());
	}
}