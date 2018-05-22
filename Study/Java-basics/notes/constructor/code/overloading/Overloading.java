package code.overloading;

public class Overloading {
	public static void main(String[] args) {

		Student a = new Student(16);
		Student b = new Student(18, "Liam");

		System.out.println("the name of a student: " + a.Name);
		System.out.println("the age of a student: " + a.Age);

		System.out.println("the name of b student: " + b.Name);
		System.out.println("the age of b student: " + b.Age); 
	}
}