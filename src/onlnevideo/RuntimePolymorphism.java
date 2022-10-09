package onlnevideo;
class AA{
	public void show() {
		System.out.println("in A");
		
	}
	
}


class BB extends AA{
	public void show() {
		
		System.out.println("In B");
	}
	
	
}

class CC extends BB{
	public void show(){
		System.out.println("In C");
		
	}
	
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		// run time polymorphism also known as method overriding which is happenning here
		AA obj1 = new BB(); // A k reference se B ka object q k A baap tha tu uska reference dedia
		obj1.show();	
		
		
		obj1 = new CC();
		obj1.show(); // Dynamic Method dispatch becoz object is changed so calling will also be changed
		// it is not an error. It is a run time change of object assigned to a class. and then from that class method is called

	}

}
