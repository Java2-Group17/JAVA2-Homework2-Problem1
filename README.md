JAVA2-Homework2-Problem1
===============
Create the following classes

Date

    -month:Integer
    -day:Integer
    -year:Integer

		<<constructor>>
		Date(Integer,Integer,Integer)
		+getMonth():Integer
		+getDay():Integer
		+getYear():Integer
		+setMonth(Integer):Void
		+setDay(Integer):Void
		+setYear(Integer):Void
		+toString():String


Student
   
    -studentID:Integer
    -firstName:String
    -lastName:String
    -gpa:Double
    -date:Date
    
		<<constructor>
		Student(Integer,String,String,Double,Date)
		+getID():Integer
		+getFirstName():String
		+getLastName():String
		+getGPA():Double
		+getDateOfAdmission():Date
		+setID(Integer):Void
		+setFirstName(String):Void
		+setLastName(String):Void
		+setGPA(Double):Void
		+setDateOfAdmission(Date):Void
		+toString():String



Based on the textbook examples 17.4, 17.5, 17.9, 17.10

Create the classes StudentRecord.java, CreateStudentTextFile.java, ReadStudentTextFile.java, and ReadStudentTextFileTest.java

Create Students.txt file with the following input

		1001 Alex Jones 3.56 6/12/2012
		1002 Bob Louis 3.89 8/24/2013
		1003 Chris Anderson 3.33 7/14/2011
		1004 David Ruth 3.85 1/15/2012
		1005 George Brown 3.52 1/25/2013
