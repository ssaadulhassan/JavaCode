package onlnevideo;

class Studenten{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getters and setters
	
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Studenten obj = new Studenten();
		obj.setName("Saad");
		System.out.println(obj.getName());;
		obj.setRollno(107);
		System.out.println(obj.getRollno());
	}

}
