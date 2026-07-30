import java.util.Scanner;
public class Automorphic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int num = sc.nextInt();

        int Original = num;
        int Square = num* num;
        int Digit = 0;
        int Divisor =1; 
        while(num>0){
            Digit++;
            num = num/ 10;
        }
        for(int i = 0; i< Digit;i++ ){
            Divisor = Divisor* 10;
        }
        int Lastnum = Square% Divisor;
        if(Lastnum==Original){
            System.out.println("The Number is Automorphic");
        }
        else{
            System.out.println("The Number is not Automorphic");
        }
    }
}