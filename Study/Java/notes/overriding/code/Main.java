package code;

public class Main {
	public static void main(String[] args) {

		overriding a_student = new overriding();

		a_student.setAge(17);

		System.out.println("The m_Age of the Student class: " + a_student.m_Age);
		System.out.println("The Age of the Human class: " + a_student.Age);
	}
}