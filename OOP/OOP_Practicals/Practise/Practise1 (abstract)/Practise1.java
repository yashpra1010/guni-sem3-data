/*The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java prog. That demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Create and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color.*/
abstract class vegetable
{
    String colour;
}

class potato extends vegetable
{
    potato()
    {
        colour="Brown";
    }
    @Override
    public String toString()
    {
        return colour;
    }
}

class brinjal extends vegetable
{
    brinjal()
    {
        colour="Purple";
    }
    @Override
    public String toString()
    {
        return colour;
    }
}

class tomato extends vegetable
{
    tomato()
    {
        colour="Red";
    }
    @Override
    public String toString()
    {
        return colour;
    }
}

public class Practise1
{
    public static void main(String[] args) 
    {
        potato obj =new potato();
        System.out.println("Vegetable: Potato\t|\tColour: "+obj);
        brinjal obj1=new brinjal();
        System.out.println("Vegetable: Brinjal\t|\tColour: "+obj1);
        tomato obj2 =new tomato();
        System.out.println("Vegetable: Potato\t|\tColour: "+obj2);
    }
}