/**************************************
*               Course                *
*-------------------------------------*
* -courseName: String                 *
* -students: ArrayList<String>        *
* -numberOfStudents: int              *
* +Course(courseName: String)         *
* +getCourseName(): String            *
* +addStudent(student: String): void  *
* +dropStudent(student: String): void *
* +getStudents(): String[]            *
* +getNumberOfStudents(): int         *
**************************************/
import java.util.ArrayList;

class Course {
	// Data fields
	private String courseName;
	private ArrayList<String> students;

	// Constructor
	/** Create a Course object */
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}

	// Methods
	/** Add a student to the list */
	public void addStudent(String student) {
		students.add(student);
	}

	/** Return students in an array */
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}

	/** Return number of students */
	public int getNumberOfStudents() {
		return students.size();
	}

	/** Return course name */
	public String getCourseName() {
		return courseName;
	}

	/** Drop a student for list */
	public void dropStudent(String student) {
		students.remove(student);
	}
	
	public void clear(){
		students.clear();
	}
	
	public void print(){
		for(int i = 0; i < students.size(); i++){
			System.out.println(students.get(i));
	}
	}
}
/*********************************************************************************
* (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList  *
* to replace an array to store students. Draw the new UML diagram for the class. *
* You should not change the original contract of the Course class (i.e., the     *
* definition of the constructors and methods should not be changed, but the      *
* private members may be changed.)                                               *
*********************************************************************************/
class Exercise_11_05 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		System.out.println("Number of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
		
		
		System.out.println("\n\nPrint using method: ");
		course2.print();
	}
}