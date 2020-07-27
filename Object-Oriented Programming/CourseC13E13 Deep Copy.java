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

class Course implements Cloneable {
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
	@Override
	public Object clone(){
		try{
			Course o = (Course)super.clone();
			o.students = new ArrayList<>(students);
			return o;
		}catch(CloneNotSupportedException ex){
			return null;
		}
	}
	
	public void print(){
		String[]a = getStudents();
		for(String e : a){
			System.out.print(e + ", ");
		}
	}
}

/*********************************************************************************
* (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6   *
* to add a clone method to perform a deep copy on the students field.            *
*********************************************************************************/
class MainC13E13 {
	public static void main(String[] args){
		// Create a course object
		Course course1 = new Course("Data Structures");

		// Add three students to course1
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne kennedy");

		// Clone course1
		Course course2 = (Course)course1.clone();

		// Add three students to course2
		course2.addStudent("Jamal Jones");
		course2.addStudent("Steve Smith");

		// Display students in course1
		System.out.println("\nNumber of students in course1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		course1.print();
		System.out.println();

		// Display students in course2
		System.out.println("\nNumber of students in course2: "
			+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		course2.print();
		System.out.println();
	}
}