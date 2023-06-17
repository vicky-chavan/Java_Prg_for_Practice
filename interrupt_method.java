package Multithreading_1;

public class interrupt_method extends Thread{

	public void run()
	{
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}}
		  catch (InterruptedException e) {
				
				System.out.println("hello i am exception"+e);
			}
		
	}
	
	public static void main(String[] args) {
		interrupt_method t=new interrupt_method();
		t.start();
		t.interrupt();
	}
	
}
