package array_programs;
import java.util.Scanner;
public class Minimum_num 
{
	public void getmin()
	{
		System.out.println("Please enter 5 num");
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int j=1;j<5;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		int min=max;
		for(int k=0;k<5;k++)
			{
			if(a[k]<min)
			{
				min=a[k];
			}
			
			}
		System.out.println(min);
	}
	public static void main(String[] args)
	{
		Minimum_num ob=new Minimum_num();
		ob.getmin();
	}

}
