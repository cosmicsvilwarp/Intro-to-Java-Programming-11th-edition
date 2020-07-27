/*********************************************************************************
* (Geometry: intersecting point) Suppose two line segments intersect. The two    *
* endpoints for the first line segment are (x1, y1) and (x2, y2) and for the     *
* second line segment are (x3, y3) and (x4, y4). Write a program that prompts    *
* the user to enter these four endpoints and displays the intersecting point. As *
* discussed in Programming Exercise 3.25, the intersecting point can be found by *
* solving a linear equation. Use the LinearEquation class in Programming         *
* Exercise 9.11 to solve this equation.                                          *
*********************************************************************************/
import java.util.Scanner;

class Intersectingpoints {
		/** Main method */
		public static void main(String[] args) {

			// Prompt the user to enter four endpoints
			System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
			double[][] points = getPoints();

			// Get a, b, c, d, e and f
			double[] p = getArguments(points);

			// Create a LinearEquation object
			LinearEquation intersectingPoint = 
				new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);

			// Display results
			if (intersectingPoint.isSolvable()) {
				System.out.println("The intersecting point is at (" + 
					intersectingPoint.getX() + ", " + intersectingPoint.getY() + ")");
			}
			else
				System.out.println("The two lines are parallel");
		}

		/** getPoints returns a 4 x 2 matrix of user endpoints */ 
		public static double[][] getPoints() {
			// Create a Scanner
			Scanner input = new Scanner(System.in);

			// Create a 4 x 2 matrix
			double[][] points = new double[4][2]; 

			for (int i = 0; i < points.length; i++) {
				for (int j = 0; j < points[i].length; j++) {
					points[i][j] = input.nextDouble();
				}
			}
			return points;
		}

		/** getArguments returns the linear equation arquments a, b, c, d, e, and f */
		public static double[] getArguments(double[][] points) {
			double[] p = new double[6];
			p[0] = points[0][1] - points[1][1];
			p[1] = -1 * (points[0][0] - points[1][0]);
			p[2] = points[2][1] - points[3][1];
			p[3] = -1 * (points[2][0] - points[3][0]);
			p[4] = (points[0][1] - points[1][1]) * points[0][0] - 
						  (points[0][0] - points[1][0]) * points[0][1];
			p[5] = (points[2][1] - points[3][1]) * points[2][0] - 
						  (points[2][0] - points[3][0]) * points[2][1];
			return p;
		}
	}
class LinearEquation {
	// Data fields
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	/** Constructor with arguments for a, b, c, d, e, and f */
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	/** Methods */
	/** Return a */
	public double getA() {
		return a;
	}

	/** Return b */
	public double getB() {
		return b;
	}

	/** Return c */
	public double getC() {
		return c;
	}

	/** Return d */
	public double getD() {
		return d;
	}

	/** Return e */
	public double getE() {
		return e;
	}

	/** Return f */
	public double getf() {
		return f;
	}

	/** Returns true if ad - bc is not 0 */
	public boolean isSolvable() {
		return a * d - b * c != 0;
	}

	/** Returns x */
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	/** Returns y */
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}