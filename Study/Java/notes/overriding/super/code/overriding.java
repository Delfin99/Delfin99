package code;

public class overriding extends Human {
	public int m_Age;

	public void setAge(int _age)
	{
		m_Age = _age;

		super.setAge(_age);
	}
}