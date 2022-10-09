package onlnevideo;

interface LambdaExpressions
{
	void show(int i);
	
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		LambdaExpressions obj = (int i) -> System.out.println(i);
		
		obj.show(4);
		

	}

}

// Please refer to anonymous inner class with interface for better understanding
