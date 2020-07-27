/****************************************************
 * 													*
 * Listing 10.6										*
 * 													*
 * *********************<UML>************************
 * -courseName: String								*	
 * -students : String[]								*
 * -numberOfStudents: int							*
 * 													*
 * +Course(courseName: String)						*
 * +getcourseName(): String							*
 * +addStudent(student: String): void				*
 * +dropStudent(student: String): void				*
 * +getStudent(): String[]							*
 * +getNumberOfStudents(): int						*
 * +printStudents(): void							*
 ****************************************************/
public class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	//Constructor
	Course(String courseName){
		this.courseName = courseName;
	}
	public String getCoursename(){
		return courseName;
	}
	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
		if(numberOfStudents >= students.length){
			String[]temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
		}
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String[]getStudents(){
		return students;
	}
	public void printStudents(){
		System.out.println("Number of Students in "+courseName +": "+getNumberOfStudents());
		for(int i = 0 ; i < getNumberOfStudents(); i++){
			System.out.println(students[i]+ " ");
		}
	}
	
	public String dropStudent(){
		return students[--numberOfStudents];
	}
	public int clear(){
		return numberOfStudents = 0;
	}
}