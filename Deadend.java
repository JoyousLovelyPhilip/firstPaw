import java.util.Scanner;
public class Deadend{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2)? num1:num2;
        System.out.println("The Max :" + max);
    }
}