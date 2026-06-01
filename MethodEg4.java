public class Multimeth{
    static int Mymethint(int a, int b){
        return a*b;
    }
    static double Mymethdob(double a, double b){
        return a*b;
    }
    public static void main(String[] args){
        int num = Mymethint(3,5);
        double num1 = Mymethdob(4.5,6.7);
        System.out.println("Interger: " +num);
        System.out.println("Double:" +num1);
    }
}