package array_programs;
import java.util.Scanner;
public class Min_num 
{
	public void getmin()
	{
		System.out.println("Please enter 5 num");
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<5;i++)
		{
			
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int j=0;j<5;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args)
	{
		Min_num ob=new Min_num();
		ob.getmin();
		
	}

}
