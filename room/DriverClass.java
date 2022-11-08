package room;

public class DriverClass {
    public static void main(String[] args) {

        TwoBHK t1 = new TwoBHK();
        t1.show();

        TwoBHK t2 = new TwoBHK(2,230,400,1500);
        t2.show();
    }
}
