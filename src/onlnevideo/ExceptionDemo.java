package onlnevideo;



public class ExceptionDemo {

	public static void main(String[] args) {
		
	try
	{
		int i = 7;
		int j=0;
		int k = i/j;
		System.out.println("Output is " +k);
		//System.out.println("I want to be executed whatever the exeption may be. And I also doesnot want to be used twice. Sol is finally block");
	}
		catch(ArithmeticException e)
	{
			System.out.println("Arithmetic Error Exists");
			//System.out.println("I want to be executed whatever the exeption may be. And I also doesnot want to be used twice. Sol is finally block");
	}
	
	finally
	{
		System.out.println("I want to be executed whatever the exeption may be. And I also doesnot want to be used twice. Sol is finally block");
	}

	}

}
