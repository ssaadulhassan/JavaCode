package onlnevideo;
class A
{
	int i;
	public void show()
	{
		System.out.println("you are standing in parent class. It is called due to absence of same method in child class");
		
	}
	
}

class  B extends A
{
	public void show() {
		super.show(); 
		super.i=8;
		System.out.println("this method is in child class and will also call parent because of line16 above it");
	}
	
	//@Override 
	public void show1() {
		System.out.println("This method is in child class and is called not from parent because it is available");
	}
	
}

public class MethodOverriding1 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show(); // output sirf yahe dega
		obj.show1(); // ye error jan  bujh k generate kia hay mene

	}

}
