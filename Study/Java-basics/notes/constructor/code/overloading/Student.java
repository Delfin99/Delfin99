package code.overloading;

public class Student {
	
	public int Age;
	public String Name;

	public Student(int _age)
	{
		Name = "Default";
		Age = _age;
	}

	public Student(int _age, String _name)
	{
		Name = _name;
		Age = _age;
	}
}