package array_programs;
import java.util.Scanner;
public class Prime_num 
{
	public void getprime(int num)
	{
		if(num==0||num==1)
		{
			System.out.println("Not Prime num");
		}
		else
		{
			int f=0;
			for(int k=2;k<num;k++)
			{
				if((num/k)*k==num)
				{
					
					System.out.println("Not Prime num");
					f=1; 
					break;
				}
			}
			if(f==0)
			{
				System.out.println("Prime num");
			}
		}
		
	}
	public static void main(String[] args)
	{
		Prime_num ob=new Prime_num();
		System.out.println("Please enter a num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getprime(num);
	}

}
