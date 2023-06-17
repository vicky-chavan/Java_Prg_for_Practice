package Multithreading_1;

public class sleep_method extends Thread {

	public void run() 
	{
	  try {
		Thread.sleep(500);
		System.out.println("jjjjjj");
	} catch (InterruptedException e) {
		
		System.out.println(e);
	}	
	}
	public static void main(String[] args)throws Exception {
		
		sleep_method s=new sleep_method();
		Thread.sleep(2000);
		s.start();
		
		
		
		
	}
	
}
