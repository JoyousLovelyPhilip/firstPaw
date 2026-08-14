import java.util.Scanner;
public class Harshad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits = " + sum);
        if (original % sum == 0){
            System.out.println(original + " is a Harshad Number");
        } else{
            System.out.println(original + " is not a Harshad Number");
        }
        sc.close();
    }
}