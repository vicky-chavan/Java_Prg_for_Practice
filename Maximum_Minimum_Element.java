package Array_prg;

public class Maximum_Minimum_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,8,6,7,99,4,5,};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}

}
