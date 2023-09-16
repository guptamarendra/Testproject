package array_programs;
import java.util.Scanner;
public class Rev_String 
{
	public void getrev(String input)
	{
		String out="";
		char[] c=input.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			out=out+c[i];
		}
		System.out.println(out);
	}
	public static void main(String[] args)
	{
		Rev_String ob=new Rev_String();
		System.out.println("Please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getrev(input);
	}

}
