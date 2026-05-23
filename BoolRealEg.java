import java.util.Scanner;
public class Vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age: ");
        int Age = sc.nextInt();

        int RightAge = 18;
        if (Age >= RightAge){
            System.out.println(" Congrats! Youre an Independent Major Adult and Your Eligible to Vote");
        }
        else{
            System.out.println("Sorry You are a Minor");
        }
    }
}