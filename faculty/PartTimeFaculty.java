package faculty;

import java.util.Scanner;

class PartTimeFaculty extends Faculty {

  private  float hours;
  private  float rate;
    Scanner sc = new Scanner(System.in);

    PartTimeFaculty(int facultyid,String name)
    {
        super(facultyid,name);

        System.out.println("enter the Hours");
        hours = sc.nextFloat();
        System.out.println("enter the rate");
        rate = sc.nextFloat();
        setSalary(hours,rate);
    }

    public double getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public String toString()
    {
        return ("FacultyId :"+facultyid+"\n"
                +"FacultyName :"+name+"\n"
               + "Salary :"+salary
        );
    }
}
