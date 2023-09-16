package array_programs;
import java.util.Scanner;
public class Maxmium_num 
{
	public void getmax()
	{
		System.out.println("plesase enter 5 num");
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int j=0;j<5;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args)
	{
		Maxmium_num ob=new Maxmium_num();
		ob.getmax();
		
	}

}
