/*	(Points nearest to each other)
 *      Listing 8.3 gives a program that finds two points in a two-dimensional space
 *      nearest to each other. Use a two-dimensional array to represent the points. 
 *      Test the program using the giving points/*

/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user for the number of points 
		System.out.println("Please enter number of points : ");
		int number_points = input.nextInt();
		
		//Prompts user for input in format (x1, y1) and (x2, y2)
		System.out.println("Please enter coordinates below (x,y format) : ");
		double [][] points = fillArray(number_points);
		
		//Display 2-D matrix 
		print(points);
		
		//Calculate shortest distance and print results
		calculate(points);
		
	}
	//Method that calculates shortest distance between 2 points 
	public static void calculate(double[][]array){
		int p1 = 0, p2 = 1;
		double mindistance = distance(array[p1][0], array[p1][1], array[p2][0], array[p2][1]);
		
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				double distance1 = distance(array[i][0], array[i][1], array[j][0], array[j][1]);
			if(distance1 < mindistance){
				p1 = i;
				p2 = j;
				mindistance = distance1;
				}
			}
		}
		System.out.println("The closest two points are "+
		"(" + array[p1][0] + ", " + array[p1][1] + ") and (" + array[p2][0] + ", " + array[p2][1] + ")");
	}
	//Method to prompt user for array inputs 
	public static double[][] fillArray(int n){
		Scanner input = new Scanner(System.in);
		double [][]array= new double[n][2];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = input.nextDouble();
				}
			}
		return array;
	}
	
	/** Compute the distance between two points (x1, y1) and (x2, y2)*/
	public static double distance(double x1, double y1, double x2, double y2){
			return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			}
			
		/*Method to display 2-D array*/
	public static void print(double[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
