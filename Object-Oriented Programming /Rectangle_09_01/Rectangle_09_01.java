/*********************************************************************************
* (The Rectangle class) Following the example of the Circle class in Section 9.2,*
* design a class named Rectangle to represent a rectangle. The class contains:   *
*                                                                                *
* ■ Two double data fields named width and height that specify the width and     *
* height of the rectangle. The default values are 1 for both width and height.   *
* ■ A no-arg constructor that creates a default rectangle.                       *
* ■ A constructor that creates a rectangle with the specified width and height.  *
* ■ A method named getArea() that returns the area of this rectangle.            *
* ■ A method named getPerimeter() that returns the perimeter.                    *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that creates two Rectangle objects—one with width 4 and height 40      *
* and the other with width 3.5 and height 35.9. Display the width, height, area, *
* and perimeter of each rectangle in this order.                                 *
*********************************************************************************/
class Rectangle_09_01 {
	/** Main method */
	public static void main(String[] args) {
		//Create Array of Object Rectangle
		// Insert Rectangle with width 4 and height 40
		// Insert Rectangle with width 3.5 and height 35.9
		Rectangle[] rect = new Rectangle[2];
		rect[0] = new Rectangle(4, 40);
		rect[1] = new Rectangle(3.5, 35.9);
		
		// Display the width, height, area, and perimeter of rectangle1
		for(int i = 0 ; i < rect.length; i++){
			System.out.println("\n Rectangle "+(i+1));
			System.out.println("-------------");
			System.out.println("Width:     " + rect[i].width);
			System.out.println("Height:    " + rect[i].height);
			System.out.println("Area:      " + rect[i].getArea());
			System.out.println("Perimeter: " + rect[i].getPerimeter());
		}
	}
}