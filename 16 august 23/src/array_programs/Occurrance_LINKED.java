package array_programs;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class Occurrance_LINKED 
{
	public void getOccurrence(String input)
	{
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		char[] c=input.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			hs.add(c[i]);
		}
		for(Character dd:hs)
		{
			int count=0;
			for(int j=0;j<=c.length-1;j++)
			{
				if(dd==c[j])
				{
					count++;
				}
			}
			System.out.println(dd+" comes in "+count+" times");
		}
		
	}
	public static void main(String[] args)
	{
		Occurrance_LINKED ob=new Occurrance_LINKED();
		System.out.println("Please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getOccurrence(input);
	}

}
