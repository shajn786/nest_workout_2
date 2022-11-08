public class MathFunction {
    static void multiply(int num1 , int num2)
    {
        int result = num1*num2;
        System.out.println("Result is "+result);
    }

    static void multiply(float num1, float num2)
    {
        float result= num1 * num2;
        System.out.println("Result is "+result);
    }

    static void multiply(int num1 , float num2)
    {
        float result = num1 * num2;
        System.out.println("Result is "+result);
    }

    public static void main(String[] args) {

        multiply(2,3);
        multiply(2.5f,2.5f);
        multiply(2,3.5f);


    }
}
