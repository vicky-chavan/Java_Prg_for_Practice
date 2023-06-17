package ProgramPractise;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int a=1;
		int num=5;
		
		while(a<=num)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==2)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("not a prime");
		}
		
	}

}
