class Bank 
{
	public double getIntRate()
	{
		return 0;
	}
}
class SBI extends Bank
{
	public double getIntRate()
	{
		return 6.9;
	}
}
class HDFC extends Bank
{
	public double getIntRate()
	{
		return 7.1;
	}
}
class BOI extends Bank
{
	public double getIntRate()
	{
		return 6.5;
	}
}
	
public class prac11 extends Bank
{
	public static void main(String[] args)
	{
		SBI yash=new SBI();
		HDFC h1=new HDFC();
		BOI b1=new BOI();

		System.out.println("\nSBI\t"+yash.getIntRate()+"%");
		System.out.println("\nHDFC\t"+h1.getIntRate()+"%");
		System.out.println("\nBOI\t"+b1.getIntRate()+"%");
	}
}