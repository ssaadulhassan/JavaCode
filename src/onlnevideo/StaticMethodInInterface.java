package onlnevideo;

interface InterfaceStatic
{
	void abc();
	// void ijk(int i);   //  This will never be possible as it will violate the policy of functional interface
	
	static void show()
	{
		System.out.println(" I am static method defined and declared in interface 1. I will be called directly without class like employee scene ");
	}
	
	static void show2()
	{
		System.out.println("You see two static methods are also possible");
	}
	
	default void def()
	{
		System.out.println("This shows that interface can have all three types of methods 1. Static 2. Abstract 3. DEFAULT itself");
	}
	
	default void fff()
	{
		System.out.println("Multiple defaults are possible");
	}
	
}

public class StaticMethodInInterface {

	public static void main(String[] args) {
		System.out.println("The idea behind this is to create an object of interface without creating a class of it (like xyz implements Interface)");
		System.out.println();
		InterfaceStatic.show();
		System.out.println();
		InterfaceStatic.show2();
		System.out.println();
		InterfaceStatic obj = () -> System.out.println("There you can see you can run Lambda expression as well");
		
		obj.abc(); // I make possible line above me to be executed
		System.out.println();
		obj.def();
		System.out.println();
		obj.fff();
		//obj.show2(); // is error ka jawab is InterfaceStatic.show2();
		

	}

}
