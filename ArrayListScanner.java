import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var students = new ArrayList<String>();
        System.out.println("How many Students aare there: ");
        int n = nextInt();
        sc.nextLine();

        for(int i = 0; i< n;i++){
            System.out.println("Enter the Nam: ");
            String name = nextLine();
            students.add(name);
        }
        System.out.println("\n Student List: ");
        for (String s : students) {
            System.out.println(s);
        }
        System.out.print("\n Enter name to search: ");
        String search = sc.nextLine();

        if (students.contains(search)) {
            System.out.println(search +" is found");
        } else {
            System.out.println(search +" is not found");
        }

    }
}