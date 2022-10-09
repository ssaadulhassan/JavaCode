package onlnevideo;
class AAA
{
	void show()
	{
		System.out.println("This is in A");
	}
	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		AAA obj = new AAA()
				{
			
			void show()
			{
				System.out.println("This is in anonymous inner class A");
			}
				};
				
		obj.show();
	}

}
