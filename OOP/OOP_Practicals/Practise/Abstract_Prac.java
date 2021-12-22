abstract class Bike
{
    Bike()
    {
        System.out.println("Bike is created");
    }
    abstract String run();
    String changegear()
    {
        return "Gear Changed";
    }
}

public class Abstract_Prac extends Bike
{	
    String run()
    {
        return "Running Safely...";
    }
    public static void main(String[] args) 
    {
        Bike obj=new Abstract_Prac();
        System.out.println(obj.run());
        System.out.println(obj.changegear());
    }
}