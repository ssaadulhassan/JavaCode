package onlnevideo;


public class ThreadingWithLambdaAIC {
	

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(() -> {
			for (int i =0; i<=1  ; i++)
			{
				System.out.println("Hi" + Thread.currentThread().getPriority());
				try {Thread.sleep(1000); } 
				catch(Exception e) {}
				
			}
		},"Hi Thread");
		//Above paragraph and the paragraph below are doing same job
		// concept of anonymous inner class, lamba expression and threads applied here
		//Same as RunnableInterface java file
		
		Runnable obj2 = () -> {
			for (int i =0; i<=1; i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000); } 
				catch(Exception e) {}
				
			}
		};
// this thread can accept runnable interface obj which has functional interface and a single run method
// So we passed the object. But we applied the concept of Anon Inner class and Functional lambda for obj1 . See para above
		// pura obj ka syntax utha k patakh dia
		Thread t2 = new Thread(obj2,"Hello Thread");
		
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY); // this will assign minimum prioirty of 0. 0 is defined in extended class Thread. just click on it.
		t2.setPriority(10);
		
		
		t1.start();
		try {Thread.sleep(50); } 
		catch(Exception e) {}
		t2.start();
		//System.out.println("Baye");  // this is the result if we dont use .join method
		t2.join();
		
		System.out.println(t1.isAlive()); // check if thread is still running
		System.out.println("Bye");
		
		

	}


}

// Rememeber Thread ka extended predefined java method is very powerful. Ye runnables ko bhi andar leleta hay. aur is me kafi tools hayn
// jo Thread.falan.falan kar k show hote hayn .  Tu iska opiug karo
// Otherwise wo userinput aur exception ki examples dekhte rehna
