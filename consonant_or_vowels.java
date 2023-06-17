package ProgramPractise;

import java.util.Scanner;

public class consonant_or_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.println("character is vowel");
		}
		else
			System.out.println("not a vowel");

	}

}
