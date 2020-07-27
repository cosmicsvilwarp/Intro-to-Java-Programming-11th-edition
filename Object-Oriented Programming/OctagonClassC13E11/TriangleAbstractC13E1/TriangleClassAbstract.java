class Triangle extends GeometricObject {
	private double side1; 
	private double side2; 
	private double side3;

	public Triangle(){
	} 

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this(side1, side2, side3);
	}

	/** Return side1 */
	public double getSide1() {
		return side1;
	}

	/** Return side2 */
	public double getSide2() {
		return side2;
	}

	/** Return side3 */
	public double getSide3() {
		return side3;
	}

	@Override /** Return area of this Triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override /** Return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override /** Return a string discription of the object */
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter(); 
	}
}