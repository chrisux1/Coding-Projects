
/**
 * Write a description of class HeaterDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HeaterDemo
{
    public static void main(String []args)
    {
        Heater myHeat = new Heater(15);
        
        System.out.println("The current temperature is: "+myHeat.getTemperature());
        
        System.out.println("\nWarming up...");
        myHeat.warmer();
        myHeat.warmer();
        myHeat.warmer();
        System.out.println("Now the temperature is "+myHeat.getTemperature());
        
        System.out.println("\nCooling off...");
        myHeat.cooler();
        myHeat.cooler();
        System.out.println("Now the temperature is "+myHeat.getTemperature());
    }
}
