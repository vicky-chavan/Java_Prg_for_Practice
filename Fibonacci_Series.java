package ProgramPractise;

public class Fibonacci_Series {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int stop=1;
	
	System.out.print(a+" ");
	while(stop++<=10)
	{
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	
	}
}
