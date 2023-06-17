package Package1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Program3_Iterator {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		for(int i=0;i<10;i++)
		{
			l.add(i);
			
		}
		System.out.println(l);
		Iterator itr =l.iterator(); 
		while(itr.hasNext())
		{
			Integer n=(Integer)itr.next();
			if(n%2==0)
			{
				System.out.print(n);
			}
			else
			{
				itr.remove();
			}
			
		}
		System.out.println(l);
	
	}

}
