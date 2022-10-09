package onlnevideo;

abstract class Writerr
{
abstract void write();

}

class pen extends Writerr
{
	void write()
	{
		System.out.println("I am a pen");
	}
	
}

class pencil extends Writerr
{
	void write()
	{
		System.out.println("I am a pencil");
	}
	
}

class kit
{
	public void doSomething(Writerr p)
	{
		p.write();
	}
	
	
}

public class AbstractClass2 {

	public static void main(String[] args) {
		kit k = new kit();
	// referenxe of writer but objeect of pen	
		Writerr p = new pen();
		// refernce of Writer but object of pencil
		Writerr pc = new pencil();
		// passing pencil and pen one by one as both extends Writer class 
		k.doSomething(pc);
		k.doSomething(p);
		
	

	}

}
