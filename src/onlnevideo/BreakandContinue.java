package onlnevideo;

public class BreakandContinue {

	public static void main(String[] args) {
		for (int i =0; i<=5; i++)
		{
			if (i==4)
			{
				break;
			}
			System.out.println("The values are " +i);
		}
		System.out.println();
		for (int j=0; j<=5; j++)
		{
			if (j == 3)
			{
				continue;
			}
			System.out.println("The values are " +j);
		}

	}

}
