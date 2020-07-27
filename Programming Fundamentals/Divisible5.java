import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		int count = 0;
		int i = 100;
		int end = 200; 
		
		for( i = 100; i < end; i++ )
		{
			if(i % 5 == 0 && i % 6 == 0)
			{
				count++;
				if(count % 10 == 0)
				{
					System.out.print(i);
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}
}