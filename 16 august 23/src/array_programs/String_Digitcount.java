package array_programs;
import java.util.Scanner;
public class String_Digitcount 
{
	public void getDigitcount(String input)
	{
		
		int out=0;
		char[] c=input.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			
			if(Character.isDigit(c[i]))
			{
				String dd=Character.toString(c[i]);
				System.out.print(dd);
				int dd1=Integer.parseInt(dd);
				out=out+dd1;
			}
		}
		System.out.print("="+out);
	}
	public static void main(String[] args)
	{
		String_Digitcount ob=new String_Digitcount();
		System.out.println("Please enter a input");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		ob.getDigitcount(input);
	}

}
