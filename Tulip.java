import java.util.Scanner;
public class Tulip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word1:");
        String w1 = sc.nextLine();
        System.out.println("Enter the word2: ");
        String w2 = sc.nextLine();

        String result = w1+w2;
        System.out.println("Result : "+result);
    }
}