package array_programs;
import java.util.Scanner;
public class Rev_matchString 
{
	public void getrev(String input1,String input2)
	{
		String out="";
		String[] s=input1.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i].equals(input2))
			{
				char[]c=s[i].toCharArray();
				for(int j=c.length-1;j>=0;j--)
				{
					out=out+c[j];
				}
			}
		}
		System.out.println(out);
	}
	public static void main(String[] args)
	{
		Rev_matchString ob=new Rev_matchString();
		System.out.println("Please enter a sentence ");
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println("Please enter a word ");
		String input2=sc.next();
		ob.getrev(input1,input2);
	}

}
