/*Sebas*/
/*(Area of a convex polygon) A polygon is convex if it contains any line segments that connects two points of the polygon. Write a program that prompts the user to enter the number of points in a convex polygon, enter the points clockwise, then displays the area of the polygon. For the formula for computing the area of a polygon, see http://www.mathwords.com/a/area_convex_polygon.htm. Here is a sample run of the program:*/
//Programmed by Sebastien on May 8th 2020 - 
import java.util.*;

class Untitled {
	
	public static void main(String[] args) {
		
		//Fill in point coordinates for polygon
		int[][]matrix = fillMatrix();
		
		//Display Matrix
		print(matrix);
		
		//Print area of the Polygon
		findArea(matrix);
		
	}
	public static int[][] fillMatrix(){
		//Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Number of points (number of sides)
		System.out.print("Enter the number of points: ");
		int  number_points = input.nextInt();
		
		//Store points in 2 columns matrix and take input
		System.out.println("Enter the coordinated of the points: ");
		int[][]matrix = new int[number_points][2];
		
		//initialize matrix 
		for(int i = 0 ; i < matrix.length -1; i++){
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = input.nextInt();
			}
		}
		//Ensuring the below properties of Convex polygon
		// (x1, y1), (x2, y2), (x3, y3), . . . , (x1, y1)
		int i = matrix.length;
		int j = matrix[0].length;
		matrix[i-1][0] = matrix[0][0];
		matrix[i-1][j-1] = matrix[0][1];
		
		//
		return matrix;
	}
	
	public static void findArea(int[][]matrix){
		int leftd = 0;
		int rightd = 0;
		for(int i = 0; i < matrix.length-1; i++){
			
			leftd += matrix[i][0] * matrix[i+1][1]; 
			
			rightd += matrix[i][1] * matrix[i+1][0];
		}
		
		//  Area of a Convex Polygon
		// http://www.mathwords.com/a/area_convex_polygon.htm
		double area = (double)1/2 * (leftd - rightd);
		
		System.out.println("The total area is "+area);
	}
	
	//Print function prints a matrix
	public static void print(int[][]m){
		for(int[]i : m)
			System.out.println(Arrays.toString(i));
	}
}