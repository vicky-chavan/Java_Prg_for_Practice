package Multithreading_1;

public class MovieSeats_Booking {

	int totalSeats=10;
	
	/*synchronized*/ public void BookSeats(int seats)
	{

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		/*synchronized(this)
		{*/
			if(totalSeats>=seats)
			{
				System.out.println("seats books successfully...");
				totalSeats=totalSeats-seats;
				System.out.println(totalSeats+"seats left");
				
			}
			else
			{
				System.out.println("no seats are left");
				System.out.println(totalSeats+"seats left");
			}
		/*}*/
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());

		
	}
}
