import java.util.Scanner;
//Write a method with the following header to display an integer in reverse order
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();
		System.out.print("The reverse of " + number + " is " + reverse(number));
	}
	
	public static int reverse (int number){
		String reverse = ""; //Holds emptry
		String n = number + ""; //Converts number to String
		//Reverses string
		for(int i = n.length()-1; i >= 0; i--)
		{
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
}

/*public static void reverse(int number) {    //another reverse function
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
		System.out.println();
	}
}*/