import java.util.Scanner;

/**
 * Write a description of class PartiallyFilledArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartiallyFilledArray
{
    public static void printPartiallyFilledArray(String bus[],int count)
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(bus[i]);
        }
    }
    
    public static void main (String[] args)
    {
       String ten[] = new String[10];
       
       Scanner scan = new Scanner(System.in);
       int count = 0;
       
       while(true)
       {
           System.out.println("Please enter a subject name or q to quit:");
           String ss = scan.nextLine();
           if(ss.equalsIgnoreCase("q"))
           {
               break;
           }
           ten[count++]=ss;
       }
       
       System.out.println("The array elements:");
       printPartiallyFilledArray(ten,count);
    }
}
