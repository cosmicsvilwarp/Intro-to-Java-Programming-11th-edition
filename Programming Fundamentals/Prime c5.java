import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		int beg = 2;
		int end = 1000;
		int LINE = 8;
		int n = 2 ; 
		
		for (n = 2 ; n < end ; n++)
		{
			boolean isprime = true;
			for (int k = 2; k < n/2 ; k++)
			{
				if (n % k == 0)
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				beg++;
				if(beg % 8 == 0)
				{
					System.out.print(n + " ");
				}
				else
				{
					System.out.print(n + " ");
				}
			}
		}
	}
}
