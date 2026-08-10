import java.util.Scanner;
public class Neon{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int Original = num;
        int square = num *num;
        int sum =0;
        while(square> 0){
            int digit = square % 10;
            sum = sum + digit;
            square = square/10;
        }
        if(sum == Original) {
            System.out.println(Original + " is a Neon Number");
        }else{
            System.out.println(Original + " is not a Neon Number");
        }
        sc.close();
    }
}