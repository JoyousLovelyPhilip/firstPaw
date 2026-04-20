import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number( note:- The number has to be a three digit number) :");
        int num = sc.nextInt();
        
        int original = num;
        int sum =0;
        while(num!= 0){
            int digit = num % 10;
            sum = sum +(digit* digit*digit);
            num = num / 10;
        }
        if(sum == original){
            System.out.println("The Given Number is Armstrong!");
    
        }
        else {
            System.out.println(" Sorry Bruh! The Number is not Armstrong, Better Luck Try again ;)");
        }
        sc.close();
    }
}