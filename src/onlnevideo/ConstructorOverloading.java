package onlnevideo;

class Casiu
{
	int num1;
	int num2;
	String operation;
	
	
	public Casiu()
	{
		num1=0;
		num2=0;
		operation="nothing";
	}
	
	public Casiu(int i)
	{
		num1=10;
		num2= i;
		operation="single parameter passed";
	}
	
	public Casiu(int i, int j)
	{
		num1= i;
		num2= j;
		operation="Two parameters are passed";
		
	}
	
	public Casiu(int i, int j , String op)
	{
		num1 = i;
		num2 = j;
		operation=op;
	}
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Casiu obj = new Casiu(4,5,"Three parameters are passed");
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);

	}

}
