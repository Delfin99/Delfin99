package code;

public class Constructor {

	public static void main(String[] args) {


		// // "new" is used to create an object
		// // assigns memory for the object
		// // below the Student() means constructor without any parameters
		// Student student = new Student();

		// the following Student(17) is a constructor having a parameter
		Student student = new Student(17);

		System.out.println("student.Age : " + student.Age);
	}
}