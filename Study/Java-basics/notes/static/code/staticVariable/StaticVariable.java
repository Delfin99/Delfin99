package code;

public class Static {
	public static void main(String[] args) {

		Student a_student = new Student();
		Student b_student = new Student();

		a_student.Add(5);
		b_student.Add(10);

		System.out.println("a_student.Num : " + a_student.Num);
		System.out.println("a_student.staticNum : " + a_student.staticNum);
		System.out.println("b_student.Num : " + b_student.Num);
		System.out.println("b_student.staticNum : " + b_student.staticNum);
		System.out.println("---------------------------------------------");

		Student.staticNum = 100;

		System.out.println("a_student.staticNum : " + a_student.staticNum);
		System.out.println("b_student.staticNum : " + b_student.staticNum);
		System.out.println("Student.staticNum : " + Student.staticNum);
	}
}