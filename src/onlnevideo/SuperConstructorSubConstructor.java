package onlnevideo;


class Super
{
	public Super()
	{
		System.out.println("Default constructor of super class");
		
	}
	
	public Super(int a) {
		System.out.println("Custom constructor of super class");
	}
	
}

class Sub extends Super{
	public Sub()
	{
		// This line enables to call default constructor of sub and custom constructor of super !
		super(5);
		System.out.println("Default constructor of sub class");
		
	}
	
	public Sub(int a)
	{
		//super(a);
		System.out.println("Custom constructor of sub class");
		
	}
}

public class SuperConstructorSubConstructor {

	public static void main(String[] args) {
	Sub obj = new Sub(6);
		System.out.println();
		System.out.println("This is from another method");
		System.out.println();
	Sub obj1 = new Sub();
		// just uncomment line number 29 to see the magic

	}

}
