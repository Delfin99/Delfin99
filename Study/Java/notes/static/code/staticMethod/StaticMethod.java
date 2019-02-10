package code.staticMethod;

public class StaticMethod {
	public static void main(String[] args) {

		Student a_student = new Student();
		
		Student.staticNum = 50;

		System.out.println("the use of a staticMethod in an object: " + a_student.getStaticNum());
		System.out.println("the use of a staticMethod named the class name: " + Student.getStaticNum());
	}
}