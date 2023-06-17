package Multithreading_1;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Work w=new Work();
		w.start();
		w.join();
		eat e=new eat();
		e.start();
		e.join();
		sleep s=new sleep();
		s.start();
		s.join();
		
		System.out.println("I am main thread");
	}
	
}
class Work extends Thread{
	public void run() {
		try{
			System.out.println("I am working now");
			Thread.sleep(500);
			System.out.println("work done");
}
catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}


class eat extends Thread{
	public void run() {
		try{
			
			System.out.println("I am eating now");
			Thread.sleep(500);
			System.out.println("eating done");
}
catch(Exception e) {
	System.out.println(e);
}
	}
}


class sleep extends Thread{
	public void run() {
		try{
			System.out.println("I am sleeping now");
			Thread.sleep(500);
			System.out.println("sleeping done");
}
catch(Exception e) {
	System.out.println(e);
}
	}
}