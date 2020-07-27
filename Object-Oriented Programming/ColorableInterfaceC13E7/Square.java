public class Square extends GeometricObject implements Colorable {
	private double side;
	
	Square(){
		this.side = 0.0;
	}
	Square(double side){
		this.side = side;
	}
	//Getters and setters
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side = side;
	}
	public void setSide(String color, boolean filled, double side){
		this.side = side;
	}
	@Override
	public double getArea(){
		return Math.pow(side, 2);
	}
	@Override
	public double getPerimeter(){
		return side * 4;
	}
	@Override
	public String name(){
		return "Square";
	}
	@Override
	public String howToColor(){
		return "Color all four sides" ;
	}
	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
	}
}