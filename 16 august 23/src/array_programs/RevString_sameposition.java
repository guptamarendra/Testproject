package array_programs;
import java.util.Scanner;
public class RevString_sameposition 
{
	public void getrev(String input)
	{
		String out="";
		String[] s=input.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			char[]c=s[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				out=out+c[j];
			}
			out=out+" ";
		}
		System.out.println(out);
	}
	public static void main(String[] args)
	{
		RevString_sameposition ob=new RevString_sameposition();
		System.out.println("Please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		ob.getrev(input);
		
	}

}
