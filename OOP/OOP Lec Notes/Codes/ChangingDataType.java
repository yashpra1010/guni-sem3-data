public class ChangingDataType {
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum: "+c);
	}

	void add(double a, double b)
	{
		double d=a+b;
		System.out.println("Sum: "+d);
	}
	public static void main(String[] args) {
		ChangingDataType obj=new ChangingDataType();
		obj.add(3, 16);
		obj.add(1.6, 2.03);
	}
}
