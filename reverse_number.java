package ProgramPractise;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		logic1(a);
		logic2(a);
		logic3(a);
		
	}
	public static void logic1(int a) {
		int rev=0;
		while(a!=0)
		{
			rev=rev*10+a%10;
			a/=10;
		}
		System.out.println("reverse number is: "+rev);
	}
	public static void logic2(int a) {
		StringBuffer sb=new StringBuffer(String.valueOf(a));
		StringBuffer rev=sb.reverse();
		System.out.println("reverse number is: "+rev);
	}
	public static void logic3(int a) {
		StringBuilder sb=new StringBuilder();
		sb.append(a);
		StringBuilder rev = sb.reverse();
		System.out.println("reverse number is: "+rev);
	}
	
}
