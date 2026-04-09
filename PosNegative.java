import java.util.Scanner;
public class PosNegative{
    public static void main(String[] args){

        Scanner nc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= nc.nextInt();

        if(num> 0){
            System.out.println("The Number is Positive");
        
        }
        else if(num < 0){
            System.out.println("The Number is Negative");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
}