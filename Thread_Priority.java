package Multithreading_1;

public class Thread_Priority extends Thread {

	public void run()
	{
		
		System.out.println("child Thread priority:"+Thread.currentThread().getPriority());//5
		
	}
	
	public static void main(String[]args)
	{
		System.out.println("main Thread priority:"+Thread.currentThread().getPriority());//5
		Thread.currentThread().setPriority(7);
		Thread_Priority t=new Thread_Priority();
		t.setPriority(8);
		t.start();
		
		
		
	}
}
