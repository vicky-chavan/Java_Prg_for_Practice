package ProgramPractise;

import java.util.Scanner;

public class factors_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		while(b<=a)
		{
			if(a%b==0)
			{
				System.out.println(b);
				
			}
			b++;
		}
	}

}
