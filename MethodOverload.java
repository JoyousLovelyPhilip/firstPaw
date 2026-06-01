public class Over{
    static int Meth(int a, int b)//With method overloading, multiple methods can have the same name with different parameters
    {
        return a+ b;
    }
    static Double Meth(double a, double b)// Multiple methods can have the same name as long as the number and/or type of parameters are different.
    {
        return a*b*100;
    }
    public static void main(String[] args){
        int num1 = Meth(4,5);
        Double num2 = Meth(3.5,9.1);
        System.out.println("num1: "+ num1);
        System.out.println("num2: " + num2);

    }
}