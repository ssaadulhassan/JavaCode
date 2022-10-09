package onlnevideo;

class outerclass
{
	int a;
	//System.out.println("This is from inner class");
	// println cannot be used inside class
	public void show()
	{
		System.out.println(" you got this from outer class object");
		
	}
	
	class innerclass
	{
		public void showinner()
		{
			System.out.println("This is from inner class");
			
		}
		
	}
	
	
	
}

class InnerClass1 {

	public static void main(String[] args) {
		outerclass objmain = new outerclass();
		
		objmain.show();
		
		outerclass.innerclass objofinnerclass = objmain.new innerclass();
				objofinnerclass.showinner();
	}

}
