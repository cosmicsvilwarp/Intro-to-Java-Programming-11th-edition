public class Circle
		extends GeometricObject implements Colorable {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String name(){
		return "Circle";
	}

	@Override /** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	@Override
	public String howToColor(){
		return "Color on the circumference" ;
	}
	

	@Override /** Implement the toString method in GeometricObject */
	public String toString() {
		return super.toString() + "\nDate created: " + getDateCreated() +
			"\nRadius: " + radius;
	}
}