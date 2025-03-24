import java.util.Scanner;

/**
 * Write a description of class average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class average
{
    public static void main (String []args)
    {
        double total = 0;
        int counter =1;
        int number;
        
        Scanner keyboard = new Scanner(System.in);
        
                
        while(counter <=5)
        {
            System.out.println("Enter a positive number");
            number = keyboard.nextInt();
            while(number<0)
            {
               System.out.println("Not Valid: Please Enter a positive number");
               number = keyboard.nextInt(); 
            }
            
            counter++;
            total=total+number;
        }
        
        double avg=total/5;
        System.out.println("The average is " +avg);
    }
}
