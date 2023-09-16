package array_programs;
import java.util.Scanner;
public class Occurance_num 
{
	public void getoccurrence(String input)
	{
		
		char[] c=input.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			System.out.println(c[i]+" comes in "+count+" times");
		}
		
	}

	public static void main(String[] args)
	{
		Occurance_num ob=new Occurance_num();
		System.out.println("Please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getoccurrence(input);
	}
}
