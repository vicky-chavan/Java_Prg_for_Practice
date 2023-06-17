package ProgramPractise;

public class perfect_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int a=1;
		int factsum=0;
		while(a<num)
		{
			if(num%a==0)
			{
				factsum+=a;
			}
			a++;
		}
		if(factsum==num)
		{
			System.out.println("number is perfect");
		}
		else
		{
			System.out.println("number is not perfect");
		}
		
	}

}
