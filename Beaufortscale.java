import java.util.Scanner;

/**
 * Write a description of class Beaufortscale here.
 *
 * @author (Christian White)
 * @version (a version number or a date)
 */
public class Beaufortscale
{
    public static void main(String []args)
    {
        int windSpeed;
        
        System.out.println("Enter wind speed in knots: ");
        Scanner keyboard = new Scanner(System.in);
        windSpeed = keyboard.nextInt();
        
        if (windSpeed < 1)
        {
            System.out.println("Calm");
        }
        else if (windSpeed <=3)
        {
            System.out.println("Light air");
        }
        else if (windSpeed <=27)
        {
            System.out.println("Breeze");
        }
        else if (windSpeed <=47)
        {
            System.out.println("Gale");
        }
        else if (windSpeed <=63)
        {
            System.out.println("Storm");
        }
        else 
        {
            System.out.println("Hurricane");
        }
    }
}

