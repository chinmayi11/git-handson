import java.util.*;
class Largest
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b&&a>c)
		{
			
			System.out.print(a+" is largest");
		
		}
		else if(b>c&&b>a)
			System.out.print(b+" is largest");
		else
			System.out.print(c+" is largest");
	}
}