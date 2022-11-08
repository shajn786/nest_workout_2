public class NumberOfInstance {

    static int count =0;

    NumberOfInstance()
    {
        count++;
    }

    protected void finalize() throws Throwable
    {
        --count;
        System.out.println("number of objects left :"+count);

    }


    public static void main(String[] args) {

        NumberOfInstance n1 = new NumberOfInstance();
        NumberOfInstance n2 = new NumberOfInstance();
        NumberOfInstance n3 = new NumberOfInstance();

        System.out.println("number of Objects created : "+count);

        n1=null;
        n2=null;

        System.gc();




    }


}
