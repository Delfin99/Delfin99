import java.io.*;


public class test2
{

	public static void main(String args[])
	{
		test2 t = new test2();
		String fileName = "/home/jeong/Desktop/sig/ReadFile/ReadCSV/data/hashtable.csv";
		t.CSV(fileName);

	}
		
	

	public void CSV(String fileName)
	{

		try {
	
			//BufferedReader reader = new BufferedReader(new FileReader("/home/jeong/Desktop/sig/ReadFile/ReadCSV/data/hashtable.csv"));
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = null;

			while ((line = reader.readLine()) != null)
			{
				String[] words = line.split(",");
				System.out.println(words[0] + words[1] + words[2]);

			}

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	} 

}
