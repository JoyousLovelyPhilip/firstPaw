import java.util.Scanner;
public class Stringdemo1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstname =sc.nextLine();
        System.out.println("Enter Last name:");
        String lastname =sc.nextLine();

        String fullname = firstname.concat ("  "). concat(lastname).concat("  ").toUpperCase();
        System.out.println("Your Fullname is : " + fullname);

        int alphabet = 0;
        int digits = 0;

        for (int i = 0; i < fullname.length();i++) {
            char ch = fullname.charAt(i);
            if (Character.isLetter(ch)){
                alphabet++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
        }
        System.out.println("Alphabet: " +alphabet);
        System.out.println("Digits:" + digits);
    }
}
