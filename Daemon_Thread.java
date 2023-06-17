package Multithreading_1;

public class Daemon_Thread extends Thread {

		public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread...");
		}
		else
		{
			System.out.println("Not a daemon Thread...");
		}
		
	}
		
		public static void main(String[] args) {
			
			System.out.println(Thread.currentThread().getName()
					);
			
			Daemon_Thread t=new Daemon_Thread();
			t.setDaemon(true);
			t.start();
			
			
		}

} 
