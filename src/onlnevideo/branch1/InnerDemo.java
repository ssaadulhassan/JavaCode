package onlnevideo.branch1;

import onlnevideo.branch1.test.Student;

//import onlnevideo.branch1.test.Student;

public class InnerDemo {
	

	public static void main(String[] args) {
		
		Student s =  new Student();
		
		s.rollno = 9; // error because it is not a part of branch1. so ise public kia ta k dosra package dekh sake
		//s.age=30;  		because package different
		//s.marks = 99;		only allowed in subsequent branch class. Package can still be different

	}

}
