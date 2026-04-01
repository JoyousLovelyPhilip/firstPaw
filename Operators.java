public class Operators{
    public static void main(String[] args)

    {
        int units = 600;
        int cost;
        if(units <= 100){
            cost = units * 2;
            System.out.println("Efficient Bill cost: " + cost);
        }
        else{
            cost = (100 * 2) + ((units - 100)*3);
            System.out.println("Moderate Bill: " + cost);
        }
    }
}