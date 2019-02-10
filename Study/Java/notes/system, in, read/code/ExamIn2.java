package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamIn2 {
	public static void main(String[] ar) throws IOException {

		byte[] arr = new byte[10];
		System.out.print("input String : ");
		// InputStream 
		// the value input is translated by 'read(arr)'
		// to byte array
		// and is stored into 'arr'
		System.in.read(arr);
		// the 'new String(arr)' can return 'arr' as string
		String str = new String(arr);
		System.out.println("output String: " + str);


		// stores string without 'byte[]' and 'new String()'
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("input String: ");
		String bufferstr = in.readLine();
		System.out.println("output String: " + bufferstr);

		try 
		{
			in.readLine();
		}
		catch (IOException e) 
		{
			System.err.println(e);
		}
	}
}