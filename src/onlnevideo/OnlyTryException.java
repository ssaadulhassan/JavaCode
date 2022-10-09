package onlnevideo;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class OnlyTryException {

	public static void main(String[] args) throws IOException {
		int n = 0;
		System.out.println("Enter a number");
		
		try(BufferedReader BReader = new BufferedReader(new InputStreamReader(System.in)))
		{
			n = Integer.parseInt(BReader.readLine());
		}
		System.out.println(n);
	}

}

// The only advantage is u are not writing finally or catch block
//and also it will close the resource itself
// not a big concept