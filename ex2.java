package StringPrograms;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello,!are you ...Vicky!!!";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==',' || str.charAt(i)=='!' || str.charAt(i)=='.')
			{
				count++;
				System.out.println(str.charAt(i));
			}
		}
		
		System.out.println(count);
	}

}
