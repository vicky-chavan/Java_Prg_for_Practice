package Calculator;

import java.util.Scanner;

public class calculator {
	
	static int start=0;
	public int add(int a){
		start=start+a;
		return start;
	}
	public int sub(int a)
	{
		start=start-a;
		return start;
	}
	public int mul(int a)
	{
		start=start*a;
		return start;
	}
	public int div(int a)
	{
		start=start/a;
		return start;
	}
	


}
