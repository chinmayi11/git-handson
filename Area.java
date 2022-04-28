import java.util.Scanner;

class Area
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter height and base of triangle : ");
		int h=s.nextInt();
		int b=s.nextInt();
		int area= (b*h)/2;
		System.out.println("Area of triangle = "+area);
	}
}
		