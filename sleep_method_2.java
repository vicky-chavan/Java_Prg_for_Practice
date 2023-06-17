package Multithreading_1;

public class sleep_method_2 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				Thread.sleep(1000);
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
