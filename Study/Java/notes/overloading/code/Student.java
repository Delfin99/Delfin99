package code;

public class Student {
	public String m_Name;
	public int m_Grade;
	public int m_Class;

	public void setinfo(String _name)
	{
		m_Name = _name;
		m_Grade = 0;
		m_Class = 0;
	}

	public void setinfo(int _grade)
	{
		m_Name = "";
		m_Grade = _grade;
		m_Class = 0;
	}

	public void setinfo(String _name, int _grade)
	{
		m_Name = _name;
		m_Grade = _grade;
		m_Class = 0;
	}

	public void setinfo(String _name, int _grade, int _class)
	{
		m_Name = _name;
		m_Grade = _grade;
		m_Class = _class;
	}

	public void setinfo(int _grade, int _class)
	{
		m_Name = "";
		m_Grade = _grade;
		m_Class = _class;
	}

}