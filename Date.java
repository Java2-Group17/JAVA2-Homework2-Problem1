//Group 17

//Jonathan Cuellar
//Navinthira Raman
//Luis Gardea
//Ephraim Girmay
//Gerardo Gonzalez-Inzunza

public class Date
{
  private int month;
  private int day;
  private int year;

  public Date()
  {
    setMonth(0);
    setDay(0);
    setYear(0);
  }
  public Date(int m, int d, int y)
  {
    setMonth(m);
    setDay(d);
    setYear(y);
  }

  ///////get methods\\\\\\\
  public int getMonth()
  {
    return month;
  }

  public int getDay()
  {
    return day;
  }

  public int getYear()
  {
    return year;
  }

  ///////set methods\\\\\\\
  public void setMonth(int m)
  {
    month = m;
  }

  public void setDay(int d)
  {
    day = d;
  }

  public void setYear(int y)
  {
    year = y;
  }

  public String toString()
  {
      return("Month: " + month + " Day: " + day + " Year: " + year);
  }

} // end class
