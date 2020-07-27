import java.util.Scanner;

//(Find the largest n such that n3 6 12,000) Use a while loop to find the largest integer n such that n3 is less than 12,000.
//Can also apply to n2

class Untitled {
	public static void main(String[] args) {
		 int n = 0;
		
		while((n*n*n)<= 12000)
		{
			n++;
			if((n*n*n)== 12000)
			{
				break;
			}
		}
		System.out.print(n);
	}
	
	
}