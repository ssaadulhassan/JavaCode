package onlnevideo.branch1;

// bhai student parent hay engineer child
// student is not available in the package so hum ne use import kia
import onlnevideo.branch1.test.Student;

public class Engineer extends Student
{
	public void show()
	{
		marks = 77; // package is different but still it is a part of subsequent class 
		
	//	age = 35; // package is different . to solve needs to be public where initilaized
		// protected members can be accessed in subclass of another PACKAGE
	}

}
