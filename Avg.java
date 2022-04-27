
class Avg
{
	static float avg;
	
public static void  calc(float a,float b,float c)
{
	avg=(a+b+c)/3;
	System.out.println("Average of float numbers= "+avg);
}
public static void calc(int a,int b,int c)
{
	avg=(a+b+c)/3;
	System.out.println("Average of int numbers= "+avg);
}
public static void main(String[] args)
{

	Avg.calc(3,5,7);
	Avg.calc(5.5f,6.1f,9.5f);
}

}