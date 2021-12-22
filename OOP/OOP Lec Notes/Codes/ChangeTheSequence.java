public class ChangeTheSequence {
	void add(int a, double b)
	{
		double c=a+b;
		System.out.println("Sum: "+c);
	}

	void add(double a, int b)
	{
		double d=a+b;
		System.out.println("Sum: "+d);
	}
	public static void main(String[] args) {
		ChangeTheSequence obj=new ChangeTheSequence();
		obj.add(3, 1.46);
		obj.add(1.6, 2);
	}
}
