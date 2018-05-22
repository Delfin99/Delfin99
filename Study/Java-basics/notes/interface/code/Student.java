package code;

// use 'implements' keyword to implement an interface
// "implements + the name of an interface"
public class Student extends Human implements Fighter {
	
	// override
	public void Fighting() 
	{
		System.out.println("Do you wanna fight with me?!!");
	}

	// override
	public void RunAway() 
	{
		System.out.println("RunAway");
	}
}
