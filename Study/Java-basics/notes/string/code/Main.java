package code;

public class Main {
	public static void main(String[] args) {

		Main main = new Main();

		// main.Example();
		// main.Example2();
		// main.Example3();
		// main.Example4();
		main.Example5();
	}

	public void Example()
	{
		String str = "Morph's house";

		System.out.println(str);
	}

	// 'length' to get the length of the string stored
	public void Example2()
	{
		String str = "Morph's house";

		System.out.println("the string stored: " + str);
		System.out.println("the length of the string stored: " + str.length());
	}

	// 'charAt' to find the location of the string stored
	public void Example3()
	{
		String str = "Morph's house";

		System.out.println("the string stored: " + str);
		System.out.println("the 9th of the string stored: " + str.charAt(2));
	}

	// String class 'constructor'
	// there are three ways
	public void Example4()
	{
		// the first way is to type directly string literal
		String str1 = "Morph's house";

		// the second is the way using 'constructor' with a parameter
		String str2 = new String("Java");

		// the last way also uses 'constructor' 
		// but, 'char[]' is passed as a parameter to initialize
		char[] charArr = {'S', 't', 'r', 'i', 'n', 'g', ' ', 'C', 'l', 'a', 's', 's'};
		String str3 = new String(charArr);

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

	// the difference of both is related with memory allocation
	public void Example5()
	{
		// those string objects share the same data(= the address of "Morph's house")
		String str1 = "Morph's house";
		String str2 = "Morph's house";

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		// those string objects don's share the same data
		String str3 = new String("Morph's house");
		String str4 = new String("Morph's house");

		System.out.println("str3: " + str3);
		System.out.println("str4: " + str4);
	}

	// 'equal'
	public void Example6()
	{

	}
}

