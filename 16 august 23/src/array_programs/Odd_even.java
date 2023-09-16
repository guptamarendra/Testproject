package array_programs;
import java.util.Scanner;
public class Odd_even 
{
	public void getoddeven(int num)
	{

		if (num%2==0)
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
		
		Odd_even ob=new Odd_even();
		System.out.println("Please enter a num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getoddeven(num);
	}
}
