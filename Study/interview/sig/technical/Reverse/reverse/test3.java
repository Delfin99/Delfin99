public class test3
{
	public String Reverse(String str)
	{
		if (str.isEmpty())
			return str;
		
		return Reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String args[])
	{
		test3 t = new test3();
		String reversedString = "";

		reversedString = t.Reverse("SeugnkiJeong");
		System.out.println(reversedString);
	}
}
