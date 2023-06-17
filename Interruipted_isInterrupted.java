package Multithreading_1;

public class Interruipted_isInterrupted extends Thread {
	
	public void run()
	{
		System.out.println(Thread.interrupted());
		//System.out.println(Thread.currentThread().isInterrupted());
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("hii"+i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Interruipted_isInterrupted t=new Interruipted_isInterrupted();
		t.start();
		t.interrupt();
		
		Thread m=Thread.currentThread();
		m.interrupt();
		System.out.println("main thread "+Thread.currentThread().isInterrupted());
		System.out.println("main thread "+Thread.interrupted());
		
	}

}
