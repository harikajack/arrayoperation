package studentalign;
import java.util.*;
public class Student
{
    private String name;
    private String idnum;
    private String Birthdate;
    private String gradDate;
    private int numGrades;
    private int [] grades = new int[numGrades];
    private double average;

    public Student()
    {

    }

    public Student(String n, String id, String b, String g, int ng, int[] gs,double a)
    {

        name = n;
        idnum = id;
        Birthdate=b;
        gradDate = g;
        numGrades = ng;
        average = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getIdnum()
    {
        return idnum;
        }


    public void setIdnum(String idnum)

    {

        this.idnum = idnum;

    }



    public String getBirthdate()

    {

        return Birthdate;

    }


    public void setBirthdate(String Birthdate)

    {

        this.Birthdate = Birthdate;
    }



    public String getGradDate()

    {

        return gradDate;

    }



    public void setGradDate(String gradDate)

    {

        this.gradDate = gradDate;

    }



    public int getNumGrades()
    {

        return numGrades;
    }



    public void setNumGrades(int numGrades)

    {

        this.numGrades = numGrades;

    }



    public int[] getGrades()

    {

        return grades;

    }



    public void setGrades(int[] grades)

    {

        this.grades = grades;

    }



    public double getAverage()

    {

        return average;

    }



    public void setAverage(double average)

    {

        this.average = average;

    }

    public void calcAverage()

    {

        int i = this.getNumGrades();

        int[] g = this.getGrades();

        double total = 0;

        for(int o=0; o<i; o++)

            total += g[o];

        this.setAverage(total/i);

    }



}


