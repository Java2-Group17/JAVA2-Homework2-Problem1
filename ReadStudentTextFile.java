//Group 17

//Jonathan Cuellar
//Navinthira Raman
//Luis Gardea
//Ephraim Girmay
//Gerardo Gonzalez-Inzunza

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadStudentTextFile
{
  private static Scanner input;

  // open file
  public static void openFile()
  {
    try
    {
      input = new Scanner(new File("Students.txt"));
    } // end try
    catch (IOException ioe)
    {
      System.err.printf("\n%s\n",
        "Error opening file");
      System.exit(1);
    } // end catch

  } // end openFile

  // Read records from the file
  public static void readRecords()
  {
    //print the header
    System.out.printf("%-10s%-12s%-12s%-10s%-12s\n",
      "ID", "First Name", "Last Name", "GPA", "Date Of Admission");

    try
    {
      while(input.hasNext())
      {
        // display the contents
        System.out.printf("%-10d%-12s%-12s%-10.2f%-12s\n",
          input.nextInt(), input.next(), input.next(), input.nextDouble(), input.next());

      } // end while
    } // end try
    catch (NoSuchElementException nsee)
    {
      System.err.printf("\n%s\n",
        "File improperly formed");
    } // end catch
    catch(IllegalStateException ise)
    {
      System.err.printf("\n%s\n",
        "Error reading from file");
      System.exit(1);
    } // end catch
  } // end readRecords

  // close the input file
  public static void closeFile()
  {
    if (input != null)
      input.close();
  } // end closeFile

} // end class
