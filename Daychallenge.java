import java.util.Scanner;
public class Daychallenge{
    public static void main(String [] args ){
    /* This Program is completely Created just to keep up my Git streak(my network range is poor too , to learn new concept and try)..do skip this one..its just few useless code line, no concept, no logic just simple blah blah ;) Have a nice day!*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Energy Level out of 100:");
        int energy = sc.nextInt();


        if(energy <= 30){
            System.out.println("Sorry Let me do later! i wanna sleep bruh");
        
        }
        else if(energy <= 50  ){
        System.out.println("Uhm im Lazy");
        }
        else {
            System.out.println("I will do it");
        }
    }
}