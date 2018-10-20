public class test2
{
	public static void main(String args[])
	{
		String s = "bbaaccaa";
		String arr1[] = s.split("a", -1);
		String[] arr2 = s.split("a", 0);
	
		System.out.println("arr1: ");
		for (String temp: arr1) 
		{
			System.out.println(temp);
		}
		System.out.println("arr2: ");
		for (String temp: arr2)
		{
			System.out.println(temp);
		}
	}
}
