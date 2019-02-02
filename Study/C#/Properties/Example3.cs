// read-only property

using System;

public class Employee 
{
	private static int counter;

	public Employee()
	{
		counter++;
	}

	public static int Counter
	{
		get
		{
			return counter;
		}

	}
}

class TestEmployee
{
	public static void Main(string[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		Console.WriteLine("No. of Employees: " + Employee.Counter);
	}
}