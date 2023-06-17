package Array_prg;

public class reverse_Array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,3,4,5,6,7,8,9};
		
		int [] b=new int[a.length];
		
		int num=0;
		System.out.println("Reverse");
		for(int i= a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+"  ");
		}
		
		
	}

}
