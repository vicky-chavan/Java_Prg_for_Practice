package Multithreading_1;

public class SingleTask_MultipleThread extends Thread {

	public void run()
	{
		System.out.println("these is thread");
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		
		SingleTask_MultipleThread st1= new SingleTask_MultipleThread();
		st1.start();
		
		SingleTask_MultipleThread st2= new SingleTask_MultipleThread();
		st2.start();
		
	}
}
