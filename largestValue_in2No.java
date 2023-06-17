package ProgramPractise;

import java.util.Scanner;

public class largestValue_in2No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers :");
		System.out.println(largenum(sc.nextInt(),sc.nextInt())+" Is Greater Number");
		
		
		
		
	}
	public static int largenum(int a,int b)
	{
		if(a>b)
		{
		 return a;
		}
		else
		{
			return b;
		}
	}

}
