public class Vowel {

	public void getVowels(String upper)
	{
		String result = "";

		// converts all to Uppercase letters
		String str = upper.toUpperCase();


		for (int i = 0; i < str.length(); i ++)
		{
			if ((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O') ||(str.charAt(i) == 'U'))
			{
				result = result + upper.charAt(i);
				System.out.println("The String contains " + upper.charAt(i));
			}		
		}		

		System.out.println(result);
	}

	public static void main(String args[]) 
	{
		Vowel v = new Vowel();

		v.getVowels("This is A test");
	}
}
