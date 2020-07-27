import java.util.*;

class BST{
	private static Node root;
	
	private static class Node{
		int data;
		Node left, right;
		int count; // # nodes in subtree rooted here
		
	public Node(int data, int count){
		this.data = data;
		this.count = count;
		}
	public Node(int data){
			this.data = data;
	}
	}
	public int size(){
		return size(root);
	}
	private int size(Node x){
		if(x == null) return 0;
		else	return x.count;
	}
	public int search(Node root, int key){
		if(root == null) return -1;
		else if(key < root.data) return search(root.left, key);
		else if(key > root.data) return search(root.right, key);
		else  return root.data;
	}
	public Node insert(Node root, int val){
		if(root == null) return new Node(val, 1);
		
		if(root.data > val){
			root.left = insert(root.left, val);
		} 
		else{
			root.right = insert(root.right, val);
		}
		root.count = size(root.left) + size(root.right) + 1;
		return root;
	}
	public Node nonRecursiveinsert(Node root, int val){
		if(root == null) return new Node(val, 1);
		Node current = root, prev = null;
		while(current != null){
			prev = current;
			if(current.data == val){
				System.out.println("Item already in tree. Cannot store duplicates");
				break;
			}else if(val < current.data){
				current = current.left;
			}
			else{
				current = current.right;
			}
		}
		if(val > prev.data){
			prev.right = new Node(val, 1);
		}
		else{
			prev.left = new Node(val, 1);
		}
		return prev;
	}
	public int min(Node x){
		if(x.left == null) return x.data;
		return min(x.left);
	}
	public int max(Node x){
		if(x.right == null) return x.data;
		return max(x.right);
	}
	public void deleteMin(){
		Node current = root;
		while(current.left != null){
			current = current.left;
		}
		if(current.right != null){
			current.left = current.right;
		}
	}
	public Node delete(Node root, int val){
		if(root == null) return null;
		if(root.data > val){
			root.left = delete(root.left, val);
		}
		else if(root.data < val){
			root.right = delete(root.right, val);
		}
		else{
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			else{
				Node inorderNode = getInorder(root.right);
				root.data = inorderNode.data;
				root.right = delete(root.right, inorderNode.data);
			}
		}
		return root;
	}
	public Node getInorder(Node root){
		if(root == null) return root;
		Node current = root;
		while(current.left != null){
			current = current.left;
		}
		return current;
	}
	public void print(Node x){
		if(x == null) return;
		print(x.left);
		System.out.println(x + " ");
		print(x.right);
	}
	public void nonRecursivePreorder(Node root){
		Stack<Node> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		Node current = root;
		while(current != null || !stack.isEmpty()){
			if(current != null){
				list.add(current.data);
				stack.push(current);
				current = current.left;
			}
			else{
				current = stack.pop();
				current = current.right;
			}
		}
		list.forEach(e -> System.out.print(e + " "));
	}
	public void nonRecursiveInorder(Node root){
		Stack<Node> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		Node current = root;
		while(current != null || !stack.isEmpty()){
			if(current != null){
				stack.push(current);
				current = current.left;
			}
			else{
				current = stack.pop();
				list.add(current.data);
				current = current.right;
			}
		}
		list.forEach(e -> System.out.print(e + " "));
	}
	
	public void nonRecursivePostOrder(Node root) {
		LinkedList<Integer> list = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		if (root == null) return;
		
		stack.push(root);
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			list.addFirst(current.data);
			if (current.left != null) {
				stack.push(current.left);
			}
			if (current.right != null) {
				stack.push(current.right);
			} 
		}
		list.forEach(e -> System.out.println(e + " "));
	}
}