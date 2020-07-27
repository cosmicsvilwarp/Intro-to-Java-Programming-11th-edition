class Demo {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		for(int i = 0; i < 9; i++){
			list.addLast(new Random().nextInt(30));
		}

		System.out.println(list);
		System.out.println();
		list.reverse();
		System.out.println(list);
	}
}