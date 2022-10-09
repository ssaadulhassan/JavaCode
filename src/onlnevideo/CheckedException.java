package onlnevideo;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CheckedException {

	public static void main(String[] args) throws Exception {
		int n =0;
		System.out.println("Enter a number ");
		BufferedReader BReader = null; // read commented line you will know why you did this.
		
		try
		{
//BufferedReader BReader = new BufferedReader(new InputStreamReader(System.in));// this is limited scope. we want finally to have visibility as well
			BReader = new BufferedReader(new InputStreamReader(System.in));
			 n = Integer.parseInt(BReader.readLine());
		}
		
		catch(Exception e)
		{
			System.out.println("The exception is " +e);
			System.out.println();
		}
		finally
		{
			
			BReader.close();
			System.out.println("throws exception is written at the top because of br.close statement as it also throws an exception");
		}
		
		
		System.out.println(n);
		
	}

}
