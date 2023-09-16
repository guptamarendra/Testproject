package array_programs;
import java.util.Scanner;
public class Ascending_order 
{
	public void getascending()
	{
		System.out.println("Please enter 5 num");
		Scanner sc=new Scanner(System.in);
		int [] a=new int [5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println(a[a.length-2]+" second last num");
	}
	public static void main(String[] args)
	{
		Ascending_order ob=new Ascending_order();
		ob.getascending();
	}

}
