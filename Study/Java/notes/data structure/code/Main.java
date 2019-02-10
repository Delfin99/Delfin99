package code;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		Main main = new Main();

		// // two ways of allocating 'ArrayList' 
		// ArrayList<String> strArr = new ArrayList<String>();

		// ArrayList<Integer> intArr;
		// intArr = new ArrayList<Integer>();

		// main.ArrayAdd();
		// main.ArrayAdd2();
		// main.ArrayRemove();
		main.ArrayContains();
		main.ArrayContains2();
	}

	public void ArrayAdd()
	{
		ArrayList<String> strArr = new ArrayList<String>();

		// 'ArrayList' provides 'add() method'
		strArr.add("Morph's");	// index 0
		strArr.add("House");	// index 1

		// 'size() method' returns the length of the list
		// so, it will be 0, 1
		for (int cnt = 0; cnt < strArr.size(); ++ cnt)
		{
			// 'get() method' is used to use the data stored
			// get(0) and get(1) 
			System.out.print(strArr.get(cnt) + " ");
		}
	}

	// adds the middle of the lise
	public void ArrayAdd2()
	{
		ArrayList<String> strArr = new ArrayList<String>();

		// 'ArrayList' provides 'add() method'
		strArr.add("Morph's");	// index 0
		strArr.add("House");	// index 1

		// the first parameter means the number of index of the list
		// then, the orignal data that had index 1 will be assigned 
		// the next index number 
		// so, 'House' will be stored on index 2
		strArr.add(1, "Happy");	// index 1

		// 'size() method' returns the length of the list
		// so, it will be 0, 1
		for (int cnt = 0; cnt < strArr.size(); ++ cnt)
		{
			// 'get() method' is used to use the data stored
			// get(0) and get(1) 
			System.out.print(strArr.get(cnt) + " ");
		}
	}

	// 'remove() method'
	public void ArrayRemove()
	{
		ArrayList<String> strArr = new ArrayList<String>();

		strArr.add("Morph's");
		strArr.add("House");

		// removes the data on index 0
		// then, index 0 wil be deleted
		// index 1 will be changed index 0
		// therefore, index 1 will be empty
		strArr.remove(0);
		
		// removes the data which has 'House'
		strArr.remove("House");

		// 'clear() method' 
		// deletes all data
		strArr.clear();

		for (int cnt = 0; cnt < strArr.size(); ++ cnt)
		{
			System.out.print(strArr.get(cnt) + " ");
		}
	}

	// 'contains() method' for search
	public void ArrayContains()
	{
		ArrayList<String> strArr = new ArrayList<String>();

		strArr.add("a");
		strArr.add("c");
		strArr.add("d");
		strArr.add("a");
		strArr.add("d");
		strArr.add("e");
		strArr.add("c");
		strArr.add("b");

		if(strArr.contains("e"))
		{
			System.out.println("'e' exits");
		}
		else
		{
			System.out.println("'e' doesn't exit");
		}
	}

	public void ArrayContains2()
	{
		ArrayList<String> strArr = new ArrayList<String>();

		strArr.add("a");
		strArr.add("c");
		strArr.add("d");
		strArr.add("a");
		strArr.add("d");
		strArr.add("e");
		strArr.add("c");
		strArr.add("b");

		// 'indexOf() method' returns the corresponding index number, searching from index 0
		System.out.println("indexOf(a): " + strArr.indexOf("a"));

		// 'lastIndexOf() method' is same as 'indexOf() method'
		// but, it starts from the last index
		System.out.println("lastIndexOf(a): " + strArr.lastIndexOf("a"));
	}
}