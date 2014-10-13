//Group 17

//Jonathan Cuellar
//Navinthira Raman
//Luis Gardea
//Ephraim Girmay
//Gerardo Gonzalez-Inzunza

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateStudentTextFile
{
  private Formatter output;


  public static void main(String[] args)
  {
    CreateStudentTextFile application = new CreateStudentTextFile();

    application.openFile();
    application.addRecords();
    application.closeFile();
  }


  public void openFile()
  {
      try
      {
        output = new Formatter("Students.txt");
      } // end try
      catch (SecurityException se)
      {
        System.err.println("You do not have write access to this file.");
        System.exit(1);
      } // end catch
      catch (FileNotFoundException fnfe)
      {
        System.err.println("Error opening or creating the file.");
        System.exit(1);
      } // end catch
  } // end openFile

  // add records to file
  public void addRecords()
  {
    StudentRecord record = new StudentRecord();

    Scanner input = new Scanner(System.in);

    System.out.printf("%s\n%s\n%s\n%s\n\n",
        "To terminate input, type the end-of-file indicator",
        "when you are prompted to enter input.",
        "On UNIX/lINUX/Mac OS X, type <ctrl? d, then press Enter",
        "On Windows type <ctrl> z then press Enter");

      System.out.printf("%s\n%s",
        "Enter ID number (>0), first name, last name, GPA, and Date of Admission",
        "?");

      while(input.hasNext())
      {
        try
        {
          record.setID(input.nextInt());
          record.setFirstName(input.next());
          record.setLastName(input.next());
          record.setGPA(input.nextDouble());
          int m = input.nextInt();
          int d = input.nextInt();
          int y = input.nextInt();
          Date d1 = new Date(m, d, y);
          record.setDateOfAdmission(d1);

          if (record.getID() > 0)
          {
              output.format("%d %s %s %.2f %s\r\n",
              record.getID(), record.getFirstName(),
              record.getLastName(), record.getGPA(),
              record.getDateOfAdmission());
          } // end if
          else
          {
            System.out.println("Account number must be greater than 0.");
          } // end else
        } // end try
        catch (FormatterClosedException fce)
        {
          System.err.println("Error writing to file.");
          return;
        } // end catch
        catch (NoSuchElementException nsee)
        {
          System.err.println("Invalid input. Please try again.");
          input.nextLine();
        } // end catch

        System.out.printf("%s %s \n%s", "Enter ID.",
          "first name, last name, GPA, and Date of admission", "?");
      } // end while

  } // end addRecords

  public void closeFile()
  {
    if( output != null)
    output.close();
  } // end closeFile

} // end class
