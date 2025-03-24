
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    private int Temperature;
    
    public Heater(int t)
    {
        Temperature = t;
    }
    
    public void warmer()
    {
        Temperature=Temperature+5;
    }
    
    public void cooler()
    {
        Temperature=Temperature-5;
    }
    
    public int getTemperature()
    {
        return Temperature;
    }
}

