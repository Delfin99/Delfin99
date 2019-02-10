package code;

public class Example {
	public static void main(String[] args) {

		Student a_student = new Student();

		a_student.m_number = 10;

		System.out.println("the use of a variable : " + a_student.m_number);

		a_student.setNumber(20);

		System.out.println("the use of a method : " + a_student.getNumber());
	}
}