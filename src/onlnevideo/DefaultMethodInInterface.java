package onlnevideo;

@FunctionalInterface
interface Default
{
	void abc();
	
	default void show()
	{
		System.out.println("This default keyword allows you to declare and define method in interface as well. Please uncomment show() method in "
				+ "implemnted class to get concept of method overriding");
	}
}

class IntefaceInheritance implements Default
{
	public void abc()
	{
		System.out.println("The abc() was declared method and defined in implemented class ");
		System.out.println();
	}
//	public void show()
//	{
//		System.out.println("This is to show that method overriding works in interface as well otherwise leave it commented");
//	}
}

public class DefaultMethodInInterface {

	public static void main(String[] args) {
		
		System.out.println("@FunctionalInterface shows that you can have multiple default methods to fulfill the power of abstract class in interface."
				+ "...But you can only have a single declared method like abc() ");
		System.out.println();
		System.out.println("*******");
		
		Default obj = new IntefaceInheritance();
		
		obj.abc();
		obj.show();

	}

}
