package onlnevideo;

class Calcu
{
	int num1;
	int num2;
	int result;
	
//	public Calcu (int num1, int num2)
//	{
//		this.num1 = num1;
//		this.num2 = num2; // to differentiate between instance and local variable.
//		
//	}
//	
	public void add (int num1, int num2)
	{
		num1 = num1;
		num2=num2;
		System.out.println(num1+num2);
		
	}
	
}

public class ObjectDemoThisKeyword {

	public static void main(String[] args) {
	Calcu obj = new Calcu();
		
//		System.out.println(obj.num1);
//		System.out.println(obj.num2);
		obj.add(3,3);

	}

}
