package array_programs;
import java.util.Scanner;
public class Rev_num
{
	public void getrevnum(int num)
	{
		int rev=0;
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			rev=rev*10+a;
		}
		System.out.println(rev);
				
	}
	public static void main(String[] args)
	{
		Rev_num ob =new Rev_num();
		System.out.println("Please enter a num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ob.getrevnum(num);
	}
}