package Multithreading_1;

public class Multithreading_RunnableInterface implements Runnable {
	public void run()
	{
		System.out.println("Hii I am a executable Thread.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading_RunnableInterface t1=new Multithreading_RunnableInterface();
		Thread t=new Thread(t1);
		t.start();
	}

}
