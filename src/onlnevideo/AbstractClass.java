package onlnevideo;

abstract class Human 
{
	public abstract void eat();
	
	public void walk()
	{
		System.out.println("humans can walk");
	}
}

class Man extends Human 
{
	
public void eat()
{
	
System.out.println("Humans can eat inside a sub class or a child class");	
}
}
public class AbstractClass {

	public static void main(String[] args) {
		Human obj = new Man();
		obj.eat();
		
		
	}
}

