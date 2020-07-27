import java.util.Scanner;

public class get_input {
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Please enter number");
int num = input.nextInt();

System.out.println((num % 2 == 0) ? "num is even" : "num is odd");
	}
}

