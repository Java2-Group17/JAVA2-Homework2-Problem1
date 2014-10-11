//Group 17

//Jonathan Cuellar
//Navinthira Raman
//Luis Gardea
//Ephraim Girmay
//Gerardo Gonzalez-Inzunza

public class Student
{
  private int studentID;
  private String firstName;
  private String lastName;
  private double gpa;
  private Date date;


  public Student(int id, String first, String last, double g, Date d)
  {
    setID(id);
    setFirstName(first);
    setLastName(last);
    setGPA(g);
    setDateOfAdmission(d);
  }

  ///////get methods\\\\\\\
  public int getID()
  {
    return studentID;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public double getGPA()
  {
    return gpa;
  }

  public Date getDateOfAdmission()
  {
    return date;
  }

  ///////set methods\\\\\\\
  public void setID(int id)
  {
    studentID = id;
  }

  public void setFirstName(String first)
  {
    firstName = first;
  }

  public void setLastName(String last)
  {
    lastName = last;
  }

  public void setGPA(double g)
  {
    gpa = g;
  }

  public void setDateOfAdmission(Date d)
  {
    date = d;
  }

  ///////toString\\\\\\\
  public String toString()
  {
    return ("Student ID: " + studentID + "First Name: " + firstName +
      " Last Name " + lastName + " GPA: " + gpa +
      " Date of admission " + date);
  }



} // end class
