/*Sebas*/
/*********************************************************************************
* (Sum the areas of geometric objects) Write a method that sums the areas of all *
* the geometric objects in an array. The method signature is:                    *
*                                                                                *
* public static double sumArea(GeometricObject[] a)                              *
*                                                                                *
* Write a test program that creates an array of four objects (two circles and    *
* two rectangles) and computes their total area using the sumArea method.        *
*********************************************************************************/
class Exercise_13_12 {
	/** Method main */
	public static void main(String[] args) {
		// Create an array of four objects
		GeometricObject[] array = {new Circle(5), new Circle(8),
			new Rectangle(3, 4), new Rectangle(4, 2)};

		// Display results
		System.out.printf("Total area of elements in array: %.4f ",sumArea(array));
	}

	/** Returns the sum of the areas of all 
	 *  the geometric objects in an array */
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (GeometricObject e : a) {
			sum += e.getArea();
		}
		return sum;
	}
}