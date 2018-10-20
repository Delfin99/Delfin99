import java.io.*;


public class test
{
	public static void main(String args[])
	{
		
	

	try {
	
		BufferedReader reader = new BufferedReader(new FileReader("/home/jeong/Desktop/sig/ReadFile/ReadCSV/data/hashtable.csv"));
		String line = null;

		String header = reader.readLine();

		if (header != null) 
		{
			String[] titles = header.split(",");
			System.out.println(titles[0] + titles[1] + titles[2]);
		}

		while ((line = reader.readLine()) != null)
		{
			String[] words = line.split(",");
			System.out.println(words[0] + words[1] + words[2]);
		}

	}
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	} 

 }
}
