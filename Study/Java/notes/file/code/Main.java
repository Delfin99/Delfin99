package code;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		Main main = new Main();

		// main.Example();
		main.Dictionary();
		
	}

	public void Example()
	{
		File m_file = new File("test.txt");

		System.out.println("exists: " + m_file.exists());
		System.out.println("getName: " + m_file.getName());
		System.out.println("length: " + m_file.length());
		System.out.println("lastModified: " + m_file.lastModified());
		System.out.println("canRead: " + m_file.canRead());
		System.out.println("canWrite: " + m_file.canWrite());
		System.out.println("isHidden: " + m_file.isHidden());
		System.out.println("getParent: " + m_file.getParent());
		System.out.println("isFile: " + m_file.isFile());
		System.out.println("isDirectory: " + m_file.isDirectory());
	}

	public void Dictionary()
	{
		ArrayList<String> words = new ArrayList<String>();

		BufferedReader inputStream = null;

		try
		{
			inputStream = new BufferedReader(new FileReader("words.txt"));

			String l;

			while ((l = inputStream.readLine()) != null)
			{
				words.add(l);
			}

			System.out.println(words);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}


}