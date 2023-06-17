package ProgramPractise;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
