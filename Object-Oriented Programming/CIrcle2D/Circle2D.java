public class Circle2D {
	private double x;
	private double y;
	private double radius;
	//Constructors
	Circle2D(){
		this(0,0,1);
	}
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	} 
	
	//getter methods
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getRadius(){
		return radius;
	}
	//Other methods
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	public double getPerimeter(){
		return (2 * Math.PI * radius);
	}
	public boolean contains(double x, double y){
		return Math.sqrt(Math.pow(x - this.x, 2) + 
			Math.pow(y - this.y, 2)) < radius;
	}
	public boolean contains(Circle2D circle){
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
			Math.pow(circle.getY() - y, 2))  <= Math.abs(radius - circle.getRadius());
	}
	/** Return true if the specified 
	*   circle overlaps with this circle */
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}
}