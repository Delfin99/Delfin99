class Person {
 	private String name;

	/*
 	public Person(String pname) {
		this.name = pname;
 	}
	*/

 	public String getName() {
		return name;
 	}

	public void setName(String pname) {
		this.name = pname;
	}
}

public class Employee {
	public static void main(String args[]) {
		Person p1 = new Person();
		p1.setName("Jeong");
		System.out.println("Employee Name: " + p1.getName());
	}
}


 
 
