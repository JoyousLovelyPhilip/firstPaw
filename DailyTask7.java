import java.util.Scanner;
public class DailyTask7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int celsious = sc.nextInt();

        int farenheit = (celsious * 9/5)+ 32;
        System.out.println("The Temp in Farenheit: " +farenheit);
        sc.close();  
    }
}
