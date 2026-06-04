public class Cons1{
    int x;
    public Cons1(int y, int z){
        x = y *z;
    }
    public static void main(String[] args){
        Cons1 obj = new Cons1(2,3);
        System.out.println("x =" + obj.x);

    }
}