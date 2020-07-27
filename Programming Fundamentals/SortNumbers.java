import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 values.  **Press enter after each entry**");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
		}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		double temp;
		if(num2 < num1 && num2 < num3)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if(num3 < num2 && num3 < num1)
		{
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num1 < num2 && num1 < num3)
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}