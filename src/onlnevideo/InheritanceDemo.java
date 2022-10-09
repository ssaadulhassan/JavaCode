package onlnevideo;

class Calculator
{
	



	public int add (int j,int ... i)
	{
		int sum = 0;
		 j =2;
		for (int k:i)
		{
			sum = sum + k;
		}
		// double the result always
		sum = sum * j;
		return sum;
		
	}
	
}

class CalcAdv extends Calculator
{
	public int sub (int j,int ... i)
	{
		int sub = 0;
		 j =2;
		for (int k:i)
		{
			sub = k - sub;
		}
		// double the result always
		sub = sub * j;
		return sub;
		
	}
	
	
}

class CalcVeryAdv extends CalcAdv
{
	public int mul (int j,int ... i)
	{
		int mul = 1;
		 j =2;
		for (int k:i)
		{
			mul = k * mul;
		}
		// double the result always
		mul = mul * j;
		return mul;
		
	}
	
}



public class InheritanceDemo {

	public static void main(String[] args) {
		
		CalcVeryAdv obj = new CalcVeryAdv();
		System.out.println(obj.add(2,2,3));
		System.out.println(obj.sub(2,2,3));
		System.out.println(obj.mul(2,2,3));

	}

}
