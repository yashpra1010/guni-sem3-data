package practical_12;

abstract class Vehicle
{
    abstract String getspeed();
}

class TwoWheeler extends Vehicle
{
    String getspeed()
    {
        return "Speed Of Two Wheeler Is 90 km/hr";
    }
}

class FourWheeler extends Vehicle
{
    String getspeed() 
    {
        return "Speed Of Four Wheeler Is 180 km/hr";
    }
}
public class Practical_12 {

    public static void main(String[] args) {
        Vehicle yash = new TwoWheeler();
        System.out.println(yash.getspeed());
        Vehicle obj = new FourWheeler();
        System.out.println(obj.getspeed());
    }
    
}
