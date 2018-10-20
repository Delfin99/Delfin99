public class test3
{
	public static void main(String args[])
	{
		String str = new String("Susquehanna International Group Limited");

		System.out.println("Input: " + str);
		
		String[] arr = str.split(" ");

		for (String temp: arr)
		{
			System.out.println(temp);
		}
	}
}
