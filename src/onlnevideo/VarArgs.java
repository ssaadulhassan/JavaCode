package onlnevideo;

class Vararg{
	
	void add(int ... p)
	{
		int sum =0;
		for (int i : p) {
			sum = sum +i;
		}
			System.out.println(sum);
	}
	
	int addi (int ... p)
	{
		int sum = 0;
		for (int i: p)
		{
			sum = sum+i;
		}
		return sum;
	}
	
}
public class VarArgs {
	
	public static void main(String[] args) {
		Vararg obj = new Vararg();
		obj.add(2,3,5);
	System.out.println();
	
	System.out.println(obj.addi(2,3,4,5,1));
	}

}
