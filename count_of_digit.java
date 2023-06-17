package ProgramPractise;

public class count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		int a=145568;
		while(a>0)
		{
			count++;
			a/=10;
		}
		System.out.println(count);
	}

}
