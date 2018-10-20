public class test
{
	public void reverseMethod(String str)
	{
		String[] words = str.split(" ");
		String reversedString = "";

		for (int i = 0; i < words.length; i ++)
		{
			String word = words[i];
			String reversedWord = "";

			for (int j = word.length()-1; j >= 0; j --)
			{
				reversedWord = reversedWord + word.charAt(j);
			}

			reversedString = reversedString + reversedWord + " ";
		}	

		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String args[])
	{
		test t1 = new test();
		t1.reverseMethod("Seung ki Jeong");
	}
}
