
package ProgramPractise;

import java.util.Scanner;

public class Sum_of_evenNum_inRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the lower raange");
		int a=sc.nextInt();
		System.out.println("enter the higher range");
		int b=sc.nextInt();
		int sum=0;
		while(a<=b)
		{
			if(a%2==0)
			{
				sum=sum+a;
			}
			a++;
		}
		System.out.println(sum);

	}

}
