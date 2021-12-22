import java.util.*;

abstract class Book
{
    abstract String title(String name);
}

interface TitleBook
{
    String TitleBook();
}

class MyBook extends Book implements TitleBook
{
    String n;
    @Override
    public String TitleBook()
    {
        Scanner yash=new Scanner(System.in);
        n=yash.nextLine();
        return n;
    }
    @Override
    String title(String y)
    {
        return y;
    }
}

public class p14 
{
    public static void main(String[] args)
    {
        String s;
        MyBook obj=new MyBook();
        s=obj.TitleBook();
        System.out.println("The title is: "+obj.title(s));
    }
}