package code;

public class Student extends Human implements Fighter, Singer {
	
	// override
	public void Fighting() 
	{
		System.out.println("Fight");
	}

	// override
	public void RunAway()
	{
		System.out.println("Run");
	}

	// override
	public void Sing() 
	{
		System.out.println("sing ~ song ! ~");
	}
}