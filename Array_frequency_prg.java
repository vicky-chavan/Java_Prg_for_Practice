package ProgramPractise;

public class Array_frequency_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,22,33,11,1,55,55,88,22,33,33,11};
		int [] freq=new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println(a[i]+"    "+freq[i]);
			}
		}
	}

}
