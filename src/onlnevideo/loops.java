package onlnevideo;

public class loops {
// int k;
	public static void main(String[] args) {
		int i=6;
		
		//k=2;
		// static methods can only read static variables from a class
		while(i<=5)
		{
			System.out.println("Hello");
			i++;
			
		}
		
		do
		{
			System.out.println("Hello");
			i++;
			
		} 
		while (i<=5);
		
		for (int j=0; j<=5;j++)
		{
			System.out.println("Hola from for loop");
		}

	}

}
