package ProgramPractise;

import java.util.Scanner;

public class count_of_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=1;
		int num=sc.nextInt();
		int count=0;
		while(a<=num)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
		}
		System.out.println(count);
	}

}
