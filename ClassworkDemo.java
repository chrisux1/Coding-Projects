import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class File here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileDemo

{
    public static void main(String []args) throws IOException
    {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Enter the filename");
        String filename = keyboard.nextLine();
        
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        int number;
        double total=0;
        int counter=0;
        
        while (inputFile.hasNext())
        {
            number = inputFile.nextInt();
            total=total+number;
            counter++;
            System.out.println(number);
        }
        
        double avg=total/counter;
        System.out.println("The average= "+avg);
        
        inputFile.close();
        
        
        
    }
}
