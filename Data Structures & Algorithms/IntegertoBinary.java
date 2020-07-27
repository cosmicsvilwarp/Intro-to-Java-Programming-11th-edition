import java.util.*;

class IntegerToBinary {

	public static void convert(int n) {
		if (n == 0) return;
		convert(n / 2);
		System.out.print(n % 2 + " ");
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		convert(n);
		System.out.println();
	}

}