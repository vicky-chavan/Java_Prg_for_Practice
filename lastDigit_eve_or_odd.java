package ProgramPractise;

import java.util.Scanner;

public class lastDigit_eve_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true)
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			
			if(a>=10)
			{
				int b=a%10;
				if(b%2==0)
				{
					System.out.println("Last digit is even");
				}
				else
					System.out.println("not a last digit even");
			}
			else
			{
				System.out.println("number must be contain two digits");
			}
		}
	}

}
