import java .util.Scanner;
public class DailyTask4{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if(age <= 12){
            System.out.println("Your a child");
        }
        else if (age <= 19){
            System.out.println("Your a Teen");
        }
        else{
            System.out.println("Your a Adult brew");
        }

    }// just keeping git alive 
}