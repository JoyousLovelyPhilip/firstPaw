import java.util.Scanner;
public class Spy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Num = sc.nextInt();

        int sum = 0;
        int product = 1;
        while (Num >0){
            int digit = Num % 10;
            sum = sum + digit;
            product = product * digit;
            Num = Num / 10;
        }
        if(sum == product){
            System.out.println("It is a Spy Number");
        } else{
            System.out.println("It is not a Spy Number");
        }
        sc.close();
    }
}