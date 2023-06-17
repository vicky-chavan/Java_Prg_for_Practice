package ProgramPractise;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=153;
		int count=count(a);
		System.out.println(count);
		
	}
	static int count(int a)
	{
		int count=0;
		while(a>0)
		{
			a/=10;
			count++;
		}
		return count;
	}

}
