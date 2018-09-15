package code.staticVariable;

public class Student {

	public int Num;
	public static int staticNum;

	public void Add(int _add)
	{
		Num += _add;
		staticNum += _add;
	}
}
