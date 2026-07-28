import java.util.Scanner;
public class DailyTask9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 50){
            System.out.println(name + " has Passed.");
        } else{
            System.out.println(name + " has Failed.");
        }
        System.out.println("Thank you :)");
        sc.close();
    }
}