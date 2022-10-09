 package onlnevideo;

public class twoDArray {

	public static void main(String[] args) {
		int d[][] = {
				{1,2,3,4},
				{5,6,7},
				{8,9,10,11}
		};
		
		for (int i=0; i<d.length;i++)
		{
			for (int j=0; j<d[i].length;j++)
			{
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		for (int j[] : d)
		{
			for (int k : j )
			{
				System.out.print(" " + k);
			}
			System.out.println();
		}
		
//		//enhanced for loop for 1 d array
//		int[] p = {1,2,3,4};
//		
//		for (int w: p)
//			
//		{
//			System.out.println(w);
//		
//		}
		}
		
		

	}
