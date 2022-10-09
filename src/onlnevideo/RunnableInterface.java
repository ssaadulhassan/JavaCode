package onlnevideo;

class Hii implements Runnable
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


class Helloo implements Runnable
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


public class RunnableInterface {
	

	public static void main(String[] args) {
		
		Runnable obj1 = new Hii();
		Runnable obj2 = new Helloo();
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		System.out.println(t1.isAlive()); // check if thread is still running
		try {Thread.sleep(50); } 
		catch(Exception e) {}
		t2.start();
		
		

	}


}

// internally thread executes a method run whenever you call start() method.
// so you used run in Hello and Hi
