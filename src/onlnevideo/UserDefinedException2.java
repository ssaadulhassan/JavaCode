package onlnevideo;

public class UserDefinedException2 {

	public static void main(String[] args) {
		int i,j,k;
		i=8;
		j=9;
		try
		{
			System.out.println("");
			k = i/j; // will return 0 which I want to declare as exception
			
			if (k==0)
				throw new SaadException("You are getting an error by utilizing the method of father ka father . double extended");
				System.out.println("k");
				
		}
		
		catch(SaadException e)
		{
			System.out.println("Error " +e.getMessage());
			// .getMessage is inherited from extended class .
			// to use it correctly click on it and it will tell you to use super(your String s) and it will read the message and display now
			System.out.println();
			
			
		}
	}

}






