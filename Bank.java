import java.util.*;
class Bank
{
	static int bal=0;
	public static void balance()
	{
		System.out.println("Available balance = "+bal);
	}
	public static void deposit(int amt)
	{
            bal=bal+amt;
	}
	public static void withdraw(int amt)
	{
		if(amt<=bal)
		{
			bal=bal-amt;
			System.out.println("Amount of rupees "+amt+" withdrawn from account.");
		}
		else
		{
			System.out.println("Insufficient fund");
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Bank.balance();
		System.out.println("Enter amount to deposit ");
		int a=s.nextInt();
		Bank.deposit(a);
		Bank.balance();;
		System.out.println("Enter amount to withdraw from account ");
		int w=s.nextInt();
		Bank.withdraw(w);
		Bank.balance();
	}
}
		
			
		
		