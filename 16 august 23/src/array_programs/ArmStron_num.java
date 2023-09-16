package array_programs;

import java.util.Scanner;

public class ArmStron_num 
{
	public void getarmstrong(int num)
	{
		int temp=num;
		int out=0;
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			out=out+(a*a*a);
		}
		if(temp==out)
		{
			System.out.println("ArmStrong num");
		}
		else 
		{
			System.out.println("Not Armstrong num");
		}
	}
	public static void main(String[] args)
	{
		ArmStron_num ob=new ArmStron_num();
		System.out.println("Please enter a num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getarmstrong(num);
	}

}
