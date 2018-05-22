package code;

public class Exception {
	public static void main(String[] args) {

		int num1 = 10, num2 = 0;
		double result;

		try
		{
			result = num1 / num2;

			System.out.println("the result value: " + String.valueOf(result));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0");
			System.out.println("the description of the error: " + e.toString());
		}
	}
}