package ProgramPractise;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=a;
		int sum=0;
		if(a>=10)
		{
			while(num>0)
			{
				int last=num%10;
				sum=(sum*10)+last;
				num/=10;
			}
			if(sum==a)
			{
				System.out.println("number is palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		}
		
		else
		{
			System.out.println("number should be greater than the 10");
		}
		
	}
}
