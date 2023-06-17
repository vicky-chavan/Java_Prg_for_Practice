package ProgramPractise;

public class Swapping_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		swapping1(a, b);
		swapping2(a, b);
		swapping3(a, b);
		swapping4(a, b);
		swapping5(a, b);	
	}
	public static void swapping1(int a,int b){
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a :"+a +"    b :"+b);
		
	}
	public static void swapping2(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a :"+a +"    b :"+b);
	}
	public static void swapping3(int a, int b){
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a :"+a +"    b :"+b);
	}
	public static void swapping4(int a,int b){
		b=(a+b-(a=b));
		System.out.println("a :"+a +"    b :"+b);
	}
	public static void swapping5(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a :"+a +"    b :"+b);
	}

}
