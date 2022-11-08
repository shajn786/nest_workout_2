package medicine;
import java.util.Random;

public class TestMedicine {

    public static void main(String[] args) {

        Random r = new Random();

        int i = r.nextInt(3)+1;


        System.out.println(i);

        switch(i)
        {

            case 1:

                Medicine m1 = new Medicine(1,"Paracetamol","6HWM+56W, Industrial Estate, Kallimel PO, Alappuzha");
                Tablet t1 = new Tablet();
                m1.displayLabel();
                t1.displayLabel();
                break;

            case 2:

                Medicine m2 = new Medicine(2,"Benadryl","6HWM+56W, Industrial Estate, Kallimel PO, Alappuzha");
                Syrup s1 = new Syrup();
                m2.displayLabel();
                s1.displayLabel();
                break;

            case 3:

                Medicine m3 = new Medicine(3,"Moov","6HWM+56W, Industrial Estate, Kallimel PO, Alappuzha");
                Ointment o1 = new Ointment();
                m3.displayLabel();
                o1.displayLabel();
                break;
        }

    }
}
