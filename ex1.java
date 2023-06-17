package StringPrograms;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello my name is vicky";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
