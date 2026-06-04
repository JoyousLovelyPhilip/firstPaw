public class Cons{
    int x ;
    public Cons()//A constructor in Java is a special method that is used to initialize objects.he constructor is called when an object of a class is created.
    {
        x = 56;
    }
    public static void main(String[] args){
        Cons Obj = new Cons();
        Obj.x = 34;
        System.out.println("num ="+ Obj.x );//op 34 .bcoz it is updated from 56 to 34
    }
}