package onlnevideo;

class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static
	{
		ceo = "Larry";
		System.out.println("This is from static block inside class to see static execute everytime class loads");
	}
	
//	public Emp()
//	{
//		eid = 2;
//		salary = 1000;
//		ceo = "Aslam sab";
//		System.out.println("This is from constructor block inside class");
//	}
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo  );
		
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
		
		Emp navin = new Emp();
		navin.eid = 11;
		navin.salary = 500;
		//Emp.ceo = "Ramlingam";
		
		Emp dabeer = new Emp();
		dabeer.eid = 22;
		dabeer.salary = 300;
	//	dabeer.ceo = "Hamza";
		//Emp.ceo = "Chatur";
		navin.show();
		
		dabeer.show();
		
		
	}

}
