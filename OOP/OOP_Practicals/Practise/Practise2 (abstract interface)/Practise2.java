/*The Transport interface declares a deliver () method. The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is implemented by the Camel and Donkey classes.*/
interface transport
{
    void deliver();
}

abstract class animal
{
    abstract String display();
}

class tiger extends animal
{
    @Override
    String display()
    {
        return "I am Tiger";
    }
}

class camel extends animal implements transport
{
    @Override
    String display()
    {
        return "I am Camel";
    }
    @Override
    public void deliver()
    {
        System.out.println("Helps in delivering goods.");
    }
}

class deer extends animal
{
    @Override
    String display()
    {
        return "I am Deer";
    }
}

class donkey extends animal implements transport
{
    @Override
    String display()
    {
        return "I am Donkey";
    }
    @Override
     public void deliver()
    {
        System.out.println("Helps in delivering goods.");
    }
}

public class Practise2 
{
    public static void main(String[] args)
    {
        tiger obj=new tiger();
        System.out.println(obj.display());
        camel obj1=new camel();
        System.out.println(obj1.display());
        obj1.deliver();
        deer obj2=new deer();
        System.out.println(obj2.display());
        donkey obj3=new donkey();
        System.out.println(obj3.display());
        obj3.deliver();
    }
}