package Multithreading_1;

public class MovieApp extends Thread {
	/*
	 * 
	 * 
	 * 
	 * 
	 * when we have to go for synchronization concept
	 * in these project there is unpredictable output to overcome this 
	 * we need Synchronization
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	static MovieSeats_Booking b;
    int seats;
	public void run()
	{
		b.BookSeats(seats);
	}

	public static void main(String[] args) {
		
		b=new MovieSeats_Booking();
		
		MovieApp m1=new MovieApp();
		m1.seats=7;
		m1.start();
		
		
		
		MovieApp m2=new MovieApp();
		m2.seats=5;
		m2.start();
	}
	
}
