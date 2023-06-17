package ProgramPractise;

import java.util.Scanner;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println(sum);
	}

}
