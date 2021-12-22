import java.io.*;

public class Return
{
	public int value()
	{
		int y=101;
		return y;
	}
	public static void main(String[] args)
	{
		Return obj=new Return();
		System.out.println(obj.value());
	}
}