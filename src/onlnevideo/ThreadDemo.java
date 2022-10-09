package onlnevideo;
//
//class A
//{
//	
//}
//// class A extends A, Thread 
// not possible 
class Hi extends Thread
{
// this method must be run cuz it must be called from extended Thread	
	public void run() 
	{
		for (int i =0; i<=3; i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000); } 
			catch(Exception e) {}
			
		}
	}
}


class Hello extends Thread
{
	// this method must be run cuz it must be called from extended Thread	
// run is internal method of thread. So it must be overwritten
	public void run() 
	{
		for (int i =0; i<=3; i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000); } 
			catch(Exception e) {}
			
		}
	}
}


public class ThreadDemo {
	

	public static void main(String[] args) {
		// Hi and Hello are threads now
		Hi obj = new Hi();
// this start is from xtended thread and this start by default calls run		
		obj.start();
		// to manage the sequence so that Hi does not comes before Hello
		try {Thread.sleep(50); } 
		catch(Exception e) {}
		Hello obj2 = new Hello();
		
		obj2.start();

	}


}

// internally thread executes a method run whenever you call start() method.
// so you used run in Hello and Hi
