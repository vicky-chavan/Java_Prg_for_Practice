package StringPrograms;

import java.util.Arrays;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="vicky";
		String str2="YKcvi";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		int strlength1=str1.length();
		int strlength2=str2.length();
		
		if(strlength1!=strlength2)
		{
			System.out.println("Not anagram");
			
		}
		else
		{
			char[] string1 =str1.toCharArray();
			char[] string2 =str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
				
	}

}
