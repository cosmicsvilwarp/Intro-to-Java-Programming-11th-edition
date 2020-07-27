
	/*********************************************************
	*                       Triangle                         *
	*--------------------------------------------------------*
	* -side1: double                                         *
	* -side2: double                                         *
	* -side3: double                                         *
	* +Triangle()                                            *
	* +Triangle(side1: double, side2: double, side3: double) *
	* +getSide1(): double                                    *
	* +getSide2(): double                                    *
	* +getSide3(): double                                    *
	* +getArea(): double                                     *
	* +getPerimeter(): double                                *
	* +toString(): String                                    *
	*********************************************************/

	// Implement Triangle class
	class Triangle 
			extends GeometricObject {
		private double side1;
		private double side2;
		private double side3;

		/** Construct default Triangle object */
		Triangle() {
			side1 = side2 = side3 = 1.0;
		}

		/** Construct a triangle with specified side1, side2 and side3 */
		Triangle(double side1, double side2, double side3) 
			throws IllegalTriangleException { 
			if(!isTriangle(side1, side2, side3))
				throw new IllegalTriangleException(side1, side2, side3);	
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
		public static boolean isTriangle(double side1, double side2, double side3){
			return ((side1 + side2 >= side3) && (side1 + side3 >= side2) && (side2 + side3 >= side1));
			
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

		/** Return area of this triangle */
		public double getArea() {
			double s = (side1 + side2 + side3) / 2;
			return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}

		/** Return perimeter of this triangle */
		public double getPerimeter() {
			return side1 + side2 + side3;
		}
		@Override
		public String toString(){
			return (super.toString()+ "\nTriangle: side1 = " + side1 + "\nside2 = " + side2 + "\nside3 = " + side3 +"\nArea: " +getArea() +"\nPerimeter: " +getPerimeter());
		}
			}
			
class IllegalTriangleException
		extends IllegalArgumentException {
			private double side1;
			private double side2;
			private double side3;
			
			IllegalTriangleException(double side1, double side2, double side3){
				super("Side 1: " + side1 + " Side 2: " + side2 + " and Side 3: " + side3 + " are not valid. \nPlease enter correct input");
				this.side1 = side1;
				this.side2 = side2;
				this.side3 = side3;
			}
			//Getter methods 
			public double getSide1(){
				return side1;
			}
			public double getSide2(){
				return side2;
			}
			public double getSide3(){
				return side3;
			}
		}
		