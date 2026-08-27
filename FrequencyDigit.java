import java.util.Scanner;
public class FrequencyDigit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Num = sc.nextInt();

        System.out.println("Enter the number to find Frequency :");
        int searchDigit =sc.nextInt();

        int count = 0 ;

        while( Num > 0 ) {
            int Digit = Num% 10; 
            if(Digit == searchDigit){
                count++ ;
            }
            Num = Num / 10;
            
        }
        System.out.println(searchDigit+ " appears " + count + " times.");
        sc.close();
    }
}