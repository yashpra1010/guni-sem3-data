public class OverLoading {
	void f(int a)
	{
		System.out.println("int");
	}

	void f(float a)
	{
		System.out.println("float");
	}
	void f(double a)
	{
		System.out.println("double");
	}
	public static void main(String[] args) {
		OverLoading obj=new OverLoading();
		obj.f(10);
		obj.f(10.36f);
		obj.f(10.3);
	}
}
