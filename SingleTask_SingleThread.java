package Multithreading_1;

public class SingleTask_SingleThread extends Thread{

	public static void main(String[] args) {
		SingleTask_SingleThread st=new SingleTask_SingleThread();
		st.start();
		System.out.println("mian thread..");
		
	}

	public void run() {
		System.out.println("These is Thread");
	}
}
