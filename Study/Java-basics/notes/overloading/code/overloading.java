package code;

public class overloading {
	public static void main(String[] args) {

		Student a_student = new Student();

		a_student.setinfo("Morph");

		System.out.println("Name: " + a_student.m_Name);
		System.out.println("Year: " + a_student.m_Grade);
		System.out.println("class: " + a_student.m_Class);
	}
}