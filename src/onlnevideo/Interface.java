package onlnevideo;

interface Writer
{
 void write();

}

class penn implements Writer
{
	public void write()
	{
		System.out.println("I am a pen");
	}
	
}

class pencill implements Writer
{
	public void write()
	{
		System.out.println("I am a pencil");
	}
	
}

class kito
{
	public void doSomething(Writer p)
	{
		p.write();
	}
	
	
}

public class Interface {

	public static void main(String[] args) {
		kito k = new kito();
	// referenxe of writer but objeect of pen	
		Writer p = new penn();
		// refernce of Writer but object of pencil
		Writer pc = new pencill();
		// passing pencil and pen one by one as both extends Writer class 
		k.doSomething(pc);
		k.doSomething(p);
		
	

	}

}
