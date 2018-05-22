public class test {
	public static void main(String[] args) {

		Student a_student = new Student(17, "Kim");
		Teacher b_teacher = new Teacher("Jeong");
		Student c_student = new Student(18, "Ann");

		System.out.println("the number of "+ a_student.getName() + " is " + a_student.getNumber());

		System.out.println("the number of "+ b_teacher.getName() + " is " + b_teacher.getNumber());

		System.out.println("the number of "+ c_student.getName() + " is " + c_student.getNumber());
	}
}

// inherit from superclass with using 'extends' keyword
class Student extends Human {
	
	private int m_number;

	public Student(int _num, String _str)
	{
		super(_str);
		m_number = _num;
	}

	public int getNumber()
	{
		return m_number;
	}
}

// inherit from superclass with using 'extends' keyword
class Teacher extends Human {

	public Teacher(String _str)
	{
		super(_str);
	}

	public String getNumber()
	{
		return "Smash!";
	}
}


// be inherited by subclass
class Human {

	private String name;

	public Human(String _str)
	{
		name = _str;
	}

	public String getName()
	{
		return name;
	}
}