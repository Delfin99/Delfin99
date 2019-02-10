package code.staticInitialize;

public class Student {
	
	public int Num;
	public static int staticNum1;
	public static int staticNum2;
	public static int staticNum3;

	static 
	{
		staticNum1 = 50;
	}

	static 
	{
		staticNum2 = 75;
	}

	static 
	{
		staticNum1 = 100;
		staticNum3 = 100;
	}
}