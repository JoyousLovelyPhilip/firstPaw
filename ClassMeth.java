public class Meths{
    static void MyCar(){
        System.out.println("I own a Lambo");
    }
    static void Speed(int speedlim){
        System.out.println("The Biggest Speed i have Exceeded is "+ speedlim+ "Km/hr");

    }
    public static void main(String[] args){
        Meths carname = new Meths();
        carname.MyCar();
        //Speed(90);you dont have to give it individually..this is a error u made
        carname.Speed(90);
    }
}