package onlnevideo;


class StudentFullyProtected{
	private int rollno;
	private String name;
	
	public int getRollno() {
		
		return getRollnopvt();
	}	
	private int getRollnopvt()
	{
		return rollno;
	}
	
	
	
	public void setRollno(int rollno) {
		setRollnopvt(rollno);
	}	
	private void setRollnopvt (int roll)
	{
		this.rollno = roll; // jo bhe nam rakh do pass roll number ne hi hona hay
	}
	
	
	
	
	public String getName() {
		return getNamepvt();
	}
	
	private String getNamepvt()
	{
		return name;
	}
	public void setName(String name) {
		setNamepvt(name);
	}
	
	private void setNamepvt (String naam)
	{
		this.name = naam;
	}
	
	//Getters and setters
	
}

public class PrivateVarPrivateMethods {

	public static void main(String[] args) {
		StudentFullyProtected obj = new StudentFullyProtected();
		obj.setName("Syed Saad ul Hassan");
		System.out.println(obj.getName());;
		obj.setRollno(106);
		System.out.println(obj.getRollno());
	}

}



