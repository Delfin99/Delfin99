import java.util.Scanner;
public class test4
{
	public static void main(String args[])
	{
		String str;
		System.out.print("Input: ");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		test4 t = new test4();
	
//		String reversed = reverseString(str);
		t.Reverse(str);
		//System.out.println("The reversed string is: "+reversed);
	}
	
	public static String reverseString(String str)
	{
		if (str.isEmpty())
			return str;

		return reverseString(str.substring(1)) + str.charAt(0);
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
