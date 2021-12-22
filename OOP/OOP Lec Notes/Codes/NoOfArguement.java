public class NoOfArguement
{
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum: "+c);
	}

	void add(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("Sum: "+d);
	}
	public static void main(String[] args) {
		NoOfArguement obj=new NoOfArguement();
		obj.add(23, 17);
		obj.add(36, 4, 10);
	}
}
