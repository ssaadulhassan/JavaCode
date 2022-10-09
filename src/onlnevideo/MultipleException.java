package onlnevideo;

public class MultipleException {

	public static void main(String[] args) {
		try
		{
			
			 int i[] = null;
			 i[6]=10;
			 int j[] = new int[4];
		//	 int[] j = new int[5];
			// System.out.println(s[3]);
			 j[5]= 6;
			 int p = 3;
			 int q = 0;
			 int r = p/q;
			 
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in the limit of size of the array");
		}
		
		catch(Exception e)
		{
			System.out.println("An exception has occured. View your code because I cannot tell the exact reason");
		}

		finally
		{
			System.out.println("I am bound to be executed irrespective of the Errors.");
			System.out.println();
			System.out.println("Keep in mind. Exception e should be at the end otherwise it will be executed for specific exceptions errors as well."
					+ "and we dont want this to happen ");
		}

	}

}
