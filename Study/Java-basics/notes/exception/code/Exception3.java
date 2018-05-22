package code;

public class Exception3 {
	public static void main(String[] args) {

		int num1 = 10, num2 = 1;
		double array[] = new double[10];

		try 
		{
			array[11] = num1 / num2;
		}
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
		finally
		{
			System.out.println("the statement must be executed");
		}
	}
}