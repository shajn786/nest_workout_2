import java.util.Scanner;

public class Employee {

    String name;
    static String result;
    int empId,ass1,ass2,ass3,total;
    float percentage;

    Employee (int empId,String name, int ass1, int ass2, int ass3)
    {
        this.empId = empId;
        this.name = name;
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ass3 = ass3;
    }

    String assessment()
    {
        if(ass1>75 && ass2>75 && ass3>75)
        {

            return "Congratulatins!! You are Promoted";
        }
        else
        {
            return "Demoted";
        }
    }

    void calculation()
    {
        total = ass1+ass2+ass3;
        percentage = (float)total/3;
        System.out.println("Employee Id :"+empId+"\nName : "+name);
        System.out.println("Total Mark : "+total+"\nPercentage : "+percentage+"%");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Employee e1 = new Employee(1,"anu",76,80,84);

       e1.calculation();
       result = e1.assessment();
       System.out.println(result);

    }
}
