import java.io.*;
import java.util.*;

/*
file format:

123 Madison 12.5 8.1 7.6 3.2
456 Youying 4.0 11.6 6.5 2.7 12.0
789 Derek 16.0 12.0 8.0 20.0 7.5
*/

public class HoursWorked {
   public static void main(String[] args) throws FileNotFoundException {
      File file = new File("hours2.txt");
      Scanner fileScan = new Scanner(file);
      
      File outputFile = new File("out.txt");
      // PrintStream output = new PrintStream(outputFile);
      PrintStream output = System.out;
      
      while (fileScan.hasNextLine()) {
         // process a single TA
         String line = fileScan.nextLine();
         Scanner lineScan = new Scanner(line);
     
         int id = lineScan.nextInt();
         String name = lineScan.next();
         
         // Read all of the hours and sum them up
         double totalHours = 0;
         int days = 0;
         while (lineScan.hasNextDouble()) {
            totalHours += lineScan.nextDouble();
            days++;
         }
         output.println(name + " (ID: " + id + ") worked " + totalHours + " total hours (" +
               totalHours / days + " avg hours/day)");
      }
   }
}
