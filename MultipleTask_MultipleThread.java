package Multithreading_1;

public class MultipleTask_MultipleThread extends Thread{

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();
		Thread2 t2=new Thread2();
		t2.start();
		System.out.println("main thread");
	}
	
}
class Thread1 extends MultipleTask_MultipleThread {
	public void run()
	{
		System.out.println("hii i am thread-1");
	}
}

class Thread2 extends MultipleTask_MultipleThread{
	public void run()
	{
		System.out.println("hii i am thread-2");
	}
	
}
