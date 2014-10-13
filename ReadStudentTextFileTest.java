//Group 17

//Jonathan Cuellar
//Navinthira Raman
//Luis Gardea
//Ephraim Girmay
//Gerardo Gonzalez-Inzunza

public class ReadStudentTextFileTest
{
  public static void main (String[] args)
  {
    ReadStudentTextFile application = new ReadStudentTextFile();

    application.openFile();
    application.readRecords();
    application.closeFile();
  }
}
