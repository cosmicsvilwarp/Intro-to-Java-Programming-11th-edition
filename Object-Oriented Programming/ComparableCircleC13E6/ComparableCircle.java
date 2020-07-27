public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
	
	public ComparableCircle() {
		}

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle(String color,
			boolean filled, double radius) {
		super(color, filled, radius);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\nArea: " + getArea();
	}
}