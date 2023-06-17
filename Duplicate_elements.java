package Array_prg;

public class Duplicate_elements {

	public static void main(String[] args) {
		int []arr= {1,2,8,9,9,8,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
