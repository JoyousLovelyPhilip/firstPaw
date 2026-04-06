import java.util.Scanner;
public class Greaternumber{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the First number: ");
    int a = sc.nextInt();
    
    System.out.println("Enter the Second number: ");
     int b = sc.nextInt();

      if(a> b){
        System.out.println("A is greater");
      }
      else if(b>a){
        System.out.println("B is greater");
      }
      else{
        System.out.println("Both Numbers are equal");
      }

      }
}

