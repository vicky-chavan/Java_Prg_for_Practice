package ProgramPractise;

import java.util.Scanner;

public class hour_to_minute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hours");
		int a=sc.nextInt();
		
		System.out.println("minutes : "+minutes(a));
		System.out.println("seconds : "+seconds(a));
	}
	public static float minutes(int min)
	{
		return min*60;
	}
	public static float seconds(int sec)
	{
		return minutes(sec)*60;
	}

}
