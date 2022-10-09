package onlnevideo;

class Calci
{
	int num1;
	int num2;
	int result;
	
	public Calci() {
		num1 = 5;
		num2 = 5;
		
		System.out.println("in constructor");
		
	}
	 public Calci(int n)
	 {
		 num1= n;
		 num2 = n;
		 
	 }
	 
	 public Calci(double p, int n)
	 {
		 num1 = (int)p;
		 num2 = n;
	 }
}


public class ObjectDemoConstructor {

	public static void main(String[] args) {
		
		Calci obj = new Calci(4);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
				
		
		
	}

}
