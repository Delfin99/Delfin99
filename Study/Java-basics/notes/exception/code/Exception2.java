package code;

public class Exception2 {
	public static void main(String[] args) {

		int num1 = 10, num2 = 1;
		double array[] = new double[10];

		try
		{
			array[11] = num1 / num2;
		}
		// the first catch statement would execute if both errors were caught
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0");
			System.out.println("the description of the error: " + e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the violation of the length of the array");
			System.out.println("the description of the error: " + e.toString());
		}
	}
}