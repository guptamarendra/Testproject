package array_programs;
import java.util.Scanner;
public class Palindrome_num 
{
	
	public void getpalindromenum(int num)
	{
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			rev=rev*10+a;
		}
		if(temp==rev) 
		{
			System.out.println(rev+" is palindrome num ");
		}
		else
		{
			System.out.println(rev+" is not palindrome num ");
		}
		
	}
	public static void main(String[] args)
	{
		Palindrome_num ob=new Palindrome_num();
		System.out.println("Please enter a num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getpalindromenum(num);
		
	}

}
