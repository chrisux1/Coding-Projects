import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class LabsArraysAndFiles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LabsArraysAndFiles
{
    public static void main(String[] args) throws IOException
    {
        String array[] = {"A","B","C","D","E","F","G"};
        
        System.out.println("The array contents:");
        
        printOnScreen(array);
        
        File output = new File("OutputStrings.txt");
        PrintWriter out = new PrintWriter(output);
        
        for(String string:array)
        {
            out.print(string+"\n");
        }
        
        out.close();
        System.out.println("Writing to the file done");
        
        File input = new File("InputSubjects.txt");
        int count = 0;
        Scanner fileScan = new Scanner(input);
        while(fileScan.hasNext())
        {
            fileScan.nextLine();
            count++;
        }
        
        String string[] = new String[count];
        count = 0;
        Scanner fileScanner = new Scanner(input);
        while(fileScanner.hasNext())
        {
            string[count++] = fileScanner.nextLine();
        }
        
        
        printOnScreen(string);
    }
    
    public static void printOnScreen(String bus[])
    {
        for(String strings: bus)
        {
            System.out.println(strings);
        }
    }
}
