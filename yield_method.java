package Multithreading_1;

public class yield_method implements Runnable{
	public void run()
	{
		
		for(int i=1;i<=5;i++) {
			System.out.println("hii i am "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		
		
		yield_method y=new yield_method();
		Thread t=new Thread(y);
		t.start();
		t.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi i am "+Thread.currentThread().getName());
			
		}
		
	}

}
