import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> StudentNos = new ArrayList <Integer>();

        System.out.println("Enter the Number of Student with Roll Numbers: ");
        int num = sc.nextInt();
        sc.nextLine();


        for(int i=0; i< num ;i++){
            System.out.println("Enter the Roll NUmber of the Students:");
            int rolls = sc.nextInt();
            StudentNos.add(rolls);
        }
        System.out.println("\n The List Of Students are:");
        for(Integer display : StudentNos){
            System.out.println(display);
        }
    }
}