/*Sebas*/
import java.util.*;

 //* Listing 10.5(refer to Listing 10.6 "Course" class.

//Exercise 10.9
/*■ The array size is fixed in Listing 10.6. Improve it to automatically increase the array size by creating a new larger array and copying the contents of the current array to it.
■ Implement the dropStudent method.
■ Add a new method named clear() that removes all students from the
course.*/

public class TestCourse {
	public static void main(String[] args) {
		
		//Make two of courses
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
	

		// Add three of students in course1
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");

		// Add two of students in course2
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		course2.addStudent("Sebastien St Vil");
		course2.dropStudent();
	
		

		// Test
		// Used additional instance method: printStudents()
		// Considering caller, it seems more proper way.
		course1.printStudents();
		course2.printStudents();
		
		// Display the information of course 1
	   /* System.out.println("Number of students in course1 "
				+ course1.getNumberOfStudents());
		String[] studentsOfCourse1 = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(studentsOfCourse1[i] + ", ");*/

		
		
		// Display the information in course2
		/*System.out.print("Number of students in course2 "
				+ course2.getNumberOfStudents());
		String[] studentsOfCourse2 = course2.getStudents();
		System.out.println();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(studentsOfCourse2[i] + ", ");*/
	}
}