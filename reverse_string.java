package ProgramPractise;

public class reverse_string {

	public static void main(String[] args) {
	String str="shatteppa"	;
	
	//way 1
	char[] ch=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--)
	{
	System.out.print(ch[i]);	
	}
	
	System.out.println();
	
	//way 2
	
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.print(str.charAt(i));
	}
	
	System.out.println();
	
	//way 3
	
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	
	//way 4
	
	StringBuilder sbuilder=new StringBuilder(str);
	System.out.println(sbuilder.reverse());
	
	}
}
