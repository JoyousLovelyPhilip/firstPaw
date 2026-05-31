public class vote{
    static void votes(int age){
        if (age < 18){
            System.out.println("You are a Minor! You are not eligible to vote");
        }
        else{
            System.out.println("You ar Eligible to vote");
        }
    }
    public static void main(String[] args){
    votes(17);
    votes(75);
    }
    }