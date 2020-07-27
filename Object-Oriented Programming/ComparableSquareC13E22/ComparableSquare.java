public class ComparableSquare extends Square
		implements Comparable<ComparableSquare> {
	/** Construct a ComparableSquare with specified properties */
	public ComparableSquare(double side) {
		super(side);
	}

	//@Override // Implement the compareTo method defined in Comparable 
	public int compareTo(ComparableSquare o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override // Implement the toString method in GeometricObject
	public String toString() {
		return" Area: " + getArea();
	}
}
