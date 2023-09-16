package array_programs;
import java.util.Scanner;
public class Dynamic_Armstrong 
{
	public int getcount(int num)
	{
		int count=0;
		while(num>0)	
		{
			num=num/10;
			count++;
		}
		return count;
	}
	public void getarmstrong(int num)
	{
		int temp=num;
		int out=0;
		int count=getcount(num);
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			int sum=1;
			for(int i=1;i<=count;i++)
			{
				sum=(sum*a);
			}
			out=out+sum;
		}
		if(temp==out)
		{
			System.out.println(temp+" is armstrong num");
		}
		else 
		{
			System.out.println(temp+" is not armstrong num");
		}
	}
	public static void main(String[] args)
	{
		Dynamic_Armstrong ob=new Dynamic_Armstrong();
		System.out.println("Please enter a num");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		ob.getarmstrong(num);
	}
}
