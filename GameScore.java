import java.util.Scanner;
public class GameScore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Round1 score: ");
        int round1 = sc.nextInt();

        System.out.println("Enter Round2 score: ");
        int round2 =sc.nextInt();

        int TotalScore = round1 + round2;
        if(TotalScore > 100){
            System.out.println("You Won Champ!!");
        }
        else{
            System.out.println("Your Doing Great, few more steps to taste sucsess, you've got this");
        }
    }
}