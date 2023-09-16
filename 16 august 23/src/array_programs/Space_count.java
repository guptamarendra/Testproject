package array_programs;
import java.util.Scanner;
public class Space_count 
{
	public void getspacecount(String input)
	{
		int count=0;
		char[] c=input.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if(c[i]==' ')
			{
				count++;
			}
		}
		System.out.println("Space count is "+count);
	}
	public static void main(String[] args)
	{
		Space_count ob=new Space_count();
		System.out.println("please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		ob.getspacecount(input);
	}

}
