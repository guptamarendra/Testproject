package array_programs;
import java.util.Scanner;
public class Vowals 
{
	public static void getvowles(char input)
	{
		if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||
				input=='A'||input=='E'||input=='I'||input=='O'||input=='U') 
		{
			System.out.println(input+" is vowles");
		}
		else if(Character.isDigit(input))
		{
			System.out.println("Wrong choice");
			
		}
		else
		{
			
			System.out.println(input+" is consonant");
		}
		
	
		
	}
	public static void main(String[] args)
	{
		
		System.out.println("Please enetr a Character");
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		getvowles(input);
		
	}

}
