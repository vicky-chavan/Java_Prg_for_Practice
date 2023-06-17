package StringPrograms;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello aeiou";
		str=str.toLowerCase();
		String consonant="";
		String vowels="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowels=vowels+str.charAt(i)+" ";
			}
			else
			{
				consonant=consonant+str.charAt(i)+" ";
			}
		}
		System.out.println(vowels);
		System.out.println(consonant);
	}

}
