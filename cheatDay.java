import java.util.Scanner;
public class cheatDay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Joyous, How are you feeling?, are you okay?");
        String sentence = sc.nextLine();

        if (sentence == "Yes im fine "){
            System.out.println("Yah Happy for you and Proud of you!, have a nice day! ;) ");
        }
        else {
            System.out.println("yah Thats okay to feel burn out dear...youre doing great, now rest and go arise and shine!! ");
        }
    }
}