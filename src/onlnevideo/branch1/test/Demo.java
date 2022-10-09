package onlnevideo.branch1.test;

import onlnevideo.Calc;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student();
		s.rollno = 23;
		s.age=30; // default type
		
		
	//	s.name = "Abdul Latif" kabhe nhn chlega because you have accessed it outside of class
//		s.setName("Abdul Latif"); // ye islie kia hay ta k navin ajae jo initialize kia ha
		
	
		System.out.println(s.getName());
		System.out.println(s.marks);  // protected
		
		// here I called from daddy package to grand child package . see line no 3
		Calc obj = new Calc();
		obj.num1 =3;
		obj.num2 = 40;
		System.out.println(obj.num1);
		
		obj.perform();
		
		System.out.println(obj.result);
		
		
		 

	}

}
