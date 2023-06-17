package Multithreading_1;

public class Get_Set_ThreadName {

	public static void main(String[] args) {
		
		//for getting current thread name
		System.out.println(Thread.currentThread().getName()); //main
		
		//for setting current thread name
		Thread.currentThread().setName("Vikram");
		System.out.println(Thread.currentThread().getName());  //Vikram
		
	}

}
