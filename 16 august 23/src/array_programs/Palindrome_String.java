package array_programs;
import java.util.Scanner;
public class Palindrome_String 
{
	public void getpalindrome(String input)
	{
		String out="";
		char[] c=input.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			out=out+c[i];
		}
		if(out.equals(input))
		{
			System.out.println(out+" is palindrome");
		} 
		else
		{
			System.out.println(out+" is Not palindrome");
		}
	}
	public static void main(String[] args)
	{
		Palindrome_String ob=new Palindrome_String();
		System.out.println("Please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getpalindrome(input);
	}

}
