package onlnevideo;

interface Interface1
{	
	void abc();
	default void   show()
	{
		
		System.out.println("This show method is in Interface 1");
		
	}
		
		
		
}

interface Interface2
{
	void abc();
	default void show()
	{
		System.out.println("This show method is in Interface 2");
	}
}

class MultipleInheritanceWithInterfaces implements Interface1, Interface2
{
	
	public void abc()
	{
		System.out.println("This is abc method and it has no issue with multiple inheritance as method is declared in interfaces and not defined"
				+ ".so method written in any interface has no effect on the inherits from any parents");
	}

	@Override
	public void show() { 
		Interface1.super.show();
	}
//	public void show()
//	{
//		System.out.println("This is in Class which inherits multiple Interfaces");
//	}
}


public class MultipleInheritanceWithInterface {

	public static void main(String[] args) {
		System.out.println("You can uncomment show method to chechk multiple functionality");
		System.out.println();
		
		Interface1  obj = new MultipleInheritanceWithInterfaces();
		
		obj.show();
		
		System.out.println();
		
		obj.abc();

	}

}
