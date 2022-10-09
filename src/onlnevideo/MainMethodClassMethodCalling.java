package onlnevideo;

//public class MainMethodClassMethodCalling {
////static int nums[] ;
//	static int i;
//	static int nums[] = new int[4];
//	public MainMethodClassMethodCalling(int j) {
//		
//	 i = j+1;
//		nums[0]=2;
//		nums[1]=2;															// uncomment and this code will work!
//		nums[2]=2;
//		nums[3]=2;
//		
//		//int nums[] = {2,4,6,8,10};
//		
//	}	
//	
////	Arrays obj = new Arrays();
//
//	public static void main(String[] args) {
//		for (int i=0; i<4; i++)
//		{
//			
//			System.out.println(MainMethodClassMethodCalling.nums[i]);
//		}
//		
//		i = 6;
//		MainMethodClassMethodCalling obj = new MainMethodClassMethodCalling(9);
//		System.out.println(MainMethodClassMethodCalling.i);
//	
//
//	}
//
//}

class methodcalling
{
	int i;
	// static int i  // to run line 83
	int nums[] = new int[4];
	public methodcalling(int j) {
		
	 i = j+1;
		nums[0]=2;
		nums[1]=4;
		nums[2]=6;
		nums[3]=8;
		
	}
		
	
}

public class MainMethodClassMethodCalling {
//static int nums[] ;
//static int i;
//static int nums[] = new int[4];
//public MainMethodClassMethodCalling(int j) {
//	
// i = j+1;
//	nums[0]=2;
//	nums[1]=2;
//	nums[2]=2;
//	nums[3]=2;
//	
//	//int nums[] = {2,4,6,8,10};
//	
//}	

//Arrays obj = new Arrays();

public static void main(String[] args) {


	methodcalling obj = new methodcalling(9);
	System.out.println(obj.i);

	
	for (int i=0; i<4; i++)
	{
		
	//	System.out.println(methodcalling.nums[i]); // Right way to access
		System.out.println(obj.nums[i]); // Wrong way to access it
		
	}
	
}
}
