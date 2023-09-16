package array_programs;
import java.util.Scanner;
public class Oddeven_withoutmod 
{
	public void getoddeven(int num)
	{
		if((num/2)*2==num)
			
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public static void main(String[] args)
	{
		Oddeven_withoutmod ob=new Oddeven_withoutmod();
		System.out.println("Please enter a num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getoddeven(num);
	}

}
