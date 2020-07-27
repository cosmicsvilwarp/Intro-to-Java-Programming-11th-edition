import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maxscore = 0;
		int secondscore = 0;
		String secondscorename = "";
		String maxscorename = "";
		
		for(int i = 0; i < 3 ; i++)
		{
			System.out.print("What is the student's name : ");
			String name = input.next();

			System.out.print("What is the student's score: ");
			int score = input.nextInt();
			if(score > maxscore)
			{
				secondscore = maxscore;
				maxscore = score;
				
				//
				secondscorename = maxscorename;
				maxscorename = name;
			}
			else if(score > secondscore)
			{
				secondscore = score;
				secondscorename = name;
			}
		
		}
		System.out.println("The student with the highest score is " + secondscorename);
		
			
		}
		
}