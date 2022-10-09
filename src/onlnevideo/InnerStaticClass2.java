package onlnevideo;
class outerclass2
{
	static int a; 
	// static innermethod() me access k liye a ko static karna para
	int b;
	
	public void outermethod()
	{
		System.out.println(" This is from outer class ka method");
		
	}
	
	static class innerclass //outerclass2$innerclass
	{ 
		
		static void innermethod()
		{
			System.out.println("This is from static inner class ka method");
			a = 6;
			System.out.println(a);
		
		}
	}
	
	
	
}



public class InnerStaticClass2 {
	
	public static void main(String[] args)
	{
		outerclass2 outerclassobj = new outerclass2();
		outerclassobj.outermethod();
		
	//	outerclass2.innerclass innerclassobj = outerclassobj.new innerclass(); // not recommended for static inner class
		outerclass2.innerclass innerclassobj = new outerclass2.innerclass();
		innerclassobj.innermethod();     // This way is not recommended
		outerclass2.innerclass.innermethod();
	}

}
