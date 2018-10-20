public class test2
{
	public static void main(String args[])
	{
		test2 t = new test2();
		t.Reverse("Seungki Jeong");
	}

	public void Reverse(String str)
	{
	//	String[] words = str.split("");
		String reversedString = "";

		for (int i = str.length()-1; i >= 0; i --)
		{
			reversedString = reversedString + str.charAt(i);
		}	

		System.out.println(reversedString);
	}
}
