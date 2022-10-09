package onlnevideo;

interface  ABC
{
	void show();
}

public class AnonymousInterfaceClass {

	public static void main(String[] args) {
		// interface ka object never possible 
		//ABC obj1 = new ABC();
		ABC obj = new ABC()
				{
			
			public void show()
			{
				System.out.println("This is anonymous inner class A with interface");
			}
				};
				
		obj.show();
	}

}




