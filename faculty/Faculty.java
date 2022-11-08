package faculty;

class Faculty {
    int facultyid;
    String name;
    int salary;

    Faculty(int facultyid,String name)
    {
        this.facultyid=facultyid;
        this.name=name;
    }

    public void setSalary(int basic, int allowance)
    {
        this.salary= basic + allowance;
    }

    public void setSalary(double hours, double rate)
    {
        this.salary= (int) (hours * rate);
    }

   public int getFacultyid()
   {
       return this.facultyid;
   }

   public String getName()
   {
       return this.name;
   }


    public double getSalary()
    {
      return this.salary;
    }

}


