package onlnevideo;

public class UserDefinedException {

	public static void main(String[] args) {
		int i,j,k;
		i=8;
		j=9;
		try
		{
			System.out.println("");
			k = i/j; // will return 0 which I want to declare as exception
			
			if (k==0)
				throw new SaadException();
				System.out.println("k");
				
		}
		
		catch(SaadException e)
		{
			System.out.println("Error " +e);
			System.out.println();
			
			SaadException obj = new SaadException();
			obj.DisplayErrorMessage();
		
		}
	}

}

// Teacher ne smjhaya k Exception ki parent class se get message kese extract karna hay. Tmne constructor k through game banadya