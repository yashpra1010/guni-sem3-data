interface Animals
{
    void Speak();
}

interface Paws 
{
    void NoOfLegs();
}

class Dog implements Animals,Paws
{
    public void Speak()
    {
        System.out.println("Dog Barks");
    }
    public void NoOfLegs()
    {
        System.out.println("They have 4 legs");
    }
}

public class p13 
{
    public static void main(String[] args) 
    {
        Dog obj=new Dog();
        obj.Speak();
        obj.NoOfLegs();
    }
}