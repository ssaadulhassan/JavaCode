package onlnevideo;

public class SaadException extends Exception {
	public SaadException()
	{
		System.out.println("Error has occured baby");
	}
	
	// this is for user defined SaadException2
	public SaadException(String s)
	{
// how do you know that you need super because you want to use the constructor of extended class.
// super(argument) usually calls the constructor or method of extended (parent) class		
		super(s);
		
	}
	
	public void DisplayErrorMessage()
	{
		System.out.println("This is your error exception and you wrote it inside a method");
	}

}
