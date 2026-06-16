public class ThisEg1{
    int year;// network issue
    String name;

    public ThisEg1(String name){
        this(2032, name );
    }
    public ThisEg1(int year, String name){
        this.year= year;
        this.name = name;
    }
    public void ThisEg1as(){
        System.out.println(year + " , "+ name );
    }
    public static void main(String[] args){
        ThisEg1 car1 = new ThisEg1("volsvogen");
        ThisEg1 car2 = new ThisEg1(2004, "Joyous");

        car1.ThisEg1as();
        car2.ThisEg1as();
    }
}
