package Calculator;

import java.util.Scanner;

public class calculatorDriver {

	public static void main(String[] args) {
		calculator c=new calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter + - * / @");
		while(true)
		{
			
			switch(sc.next().charAt(0))
			{
			case '+':
			{
				System.out.println("Enter the number :");
				int a=sc.nextInt();
				System.out.println(c.add(a));
				break;
			}
			case '-':
			{
				System.out.println("Enter the number :");
				int a=sc.nextInt();
				System.out.println(c.sub(a));
				break;
			}
			case '*':
			{
				System.out.println("Enter the number :");
				int a=sc.nextInt();
				System.out.println(c.mul(a));
				break;
			}
			case '/':
			{
				System.out.println("Enter the number :");
				int a=sc.nextInt();
				System.out.println(c.div(a));
				break;
			}
			case '@':
			{
				System.exit(0);
			}
			}
		}
	}
}
