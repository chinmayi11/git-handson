import java.util.Scanner;

class Sum
{
public static void main(String[] args)
{
	int a;
	float b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1 integer and 1 float numbers :");
	a=s.nextInt();
	b=s.nextFloat();
	c=a+b;
	System.out.println("Sum = "+c);
}
}
