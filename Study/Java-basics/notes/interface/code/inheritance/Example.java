package code.inheritance;

// implements WeaponMaster interface
public class Example implements WeaponMaster {
	
	public static void main(String[] args) {

		// the weapon interface can access the ITEM_BOOK variable
		// due to inheritance with extends keyword
		int result = WeaponMaster.ITEM_BOOK;

		System.out.println("Result: " + result);
	}


	/////////// class Example have to re-define all abstract methods

	/////	Fighter interface

	// override
	public void Fighting() 
	{
		System.out.println("Fight");
	}

	// override
	public void RunAway()
	{
		System.out.println("Run");
	}

	/////  WeaponMaster interface

	// override
	public void SwardAttack()
	{
		System.out.println("Attack with Sward");
	}

	// override
	public void Defence() 
	{
		System.out.println("Defence");
	}
}