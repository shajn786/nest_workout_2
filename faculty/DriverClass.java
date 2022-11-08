package faculty;

public class DriverClass {
    public static void main(String[] args) {

        FullTimeFaculty f1 = new FullTimeFaculty(1,"SHAJAN");
        PartTimeFaculty p1 = new PartTimeFaculty(2,"anu");
        FullTimeFaculty f2 = new FullTimeFaculty(3,"abhi");
        PartTimeFaculty p2 = new PartTimeFaculty(4,"rekhu");



        System.out.println(f1.toString());
        System.out.println(p1.toString());
        System.out.println("FacultyId :"+f2.getFacultyid()+"\n"+
                "FacultyName :"+f2.name+"\n"+
                "Salary :"+f2.salary
        );
        System.out.println("FacultyId :"+p2.getFacultyid()+"\n"+
                "FacultyName :"+p2.name+"\n"+
                "Salary :"+p2.salary
        );


    }
}
