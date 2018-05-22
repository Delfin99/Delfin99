package code;

import java.io.IOException;

public class ExamIn {
	public static void main(String[] ar) throws IOException {

		System.out.print("input: ");
		int anum = System.in.read();
		System.out.println("output: " + anum);

		// considers 'enter' key
		System.in.read();
		// System.in.read();

		System.out.print("input: ");
		int num = System.in.read() - 48;
		System.out.println("output: " + num);

		// considers 'enter' key
		System.in.read();
		// System.in.read();

		System.out.print("input: ");
		char char_ = (char) System.in.read();
		System.out.println("output: " + char_);
	}
}