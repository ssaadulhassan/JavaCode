package onlnevideo;
class student
{
	int rollnum;
	String name;
	
	
}


public class Array {
	

	public static void main(String[] args) {
		int nums[] = new int[4];
		int nums1[] = {2,3,5,6};
		
	
	for (int i=0; i<nums.length ; i ++)
	{
		
		System.out.println(nums[i]);
		
		System.out.println(nums1[i]);
		System.out.println();
	}
	// making multiple objects from a single class using arrays
	student [] s = new student[4];
	for (int i=0; i<4;i++)
	{
		s[i] = new student(); // constructor declared here
	}
	
	String j = s[1].name="Saad";
	System.out.println(j);
	



	}

}
