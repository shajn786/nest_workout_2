package faculty;

import java.util.Scanner;

class FullTimeFaculty extends Faculty{

    private int basic;
    private int allowance;
    Scanner sc = new Scanner(System.in);

    FullTimeFaculty(int faculityid,String name)
    {
        super(faculityid,name);
        System.out.println("enter the basic salary");
        basic = sc.nextInt();
        System.out.println("enter the allowance");
        allowance = sc.nextInt();
        setSalary(basic,allowance);
    }


    public int getBasic()
    {
        return this.basic;
    }

    public int getAllowance()
    {
        return this.allowance;
    }

    public String toString()
    {
        return ("FacultyId :"+facultyid+"\n"
                +"FacultyName :"+name+"\n"
                +"Salary :"+salary
                );
    }
}
