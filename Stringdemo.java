import java.util.Scanner;
public class Stringdemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstname =sc.nextLine();
        System.out.println("Enter Last name:");
        String lastname =sc.nextLine();

        String fullname = firstname.concat ("  "). concat(lastname).concat("  ").toUpperCase();
        System.out.println("Your Fullname is : " + fullname);
    }
}
