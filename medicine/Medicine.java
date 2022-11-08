package medicine;

public class Medicine {

    int medicine_id;
    String name,address;

    Medicine()
    {

    }
    Medicine(int medicine_id,String name,String address)
    {
       this.medicine_id = medicine_id;
       this.name = name;
       this.address = address;
    }

    void displayLabel()
    {

        System.out.println("Medicine Id :"+medicine_id+"\n"
        +"Medicine Name :"+name+"\n"
        +"Address Name :"+address);
    }
}
