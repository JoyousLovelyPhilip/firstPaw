import java.util.Scanner;
public class quiz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Questions[] = {"What happens 3 minutes after Joyous finishes one Java program?",
        "What is Joyous most likely to type after getting an explanation?",
        "When tired, Joyous asks for",
        "What is Joyous’s special attack in programming?"};
        String[] [] options = {{"A) Takes rest peacefully",  "B) Opens Netflix" ,"C) Says 'give me next task' immediately" , "D) Accidentally invents AI"},
        {"A)Thank you, understood." , "B) Interesting." ,"C) explain the logic", "D) I shall now write research papers."},
        {"A) A vacation", "B) Sleep", "C) Easy ArrayList task" ,"D) lazy task"},
        {"A) Writing perfect code first try" ,"B) Asking 'why this line is used?' 17 times", "C) Explaining design thinking" ,"D) Creating AI energy optimization systems"}
        };

        char[] answers = {'C','C','D','B'};
        int score= 0;

        for(int i =0; i< Questions.length; i++)//i <= Questions.length is wrong coz size is mistake it should b only <
        
    {
            System.out.println(Questions[i]);
            for(int j = 0; j< options[i].length; j++)//always use the squar bracs when defining like options[i] not options(i)
            {
                System.out.println(options[i][j]);
            }
            System.out.println("Enter the Answers");
            char joyans = sc.next().toUpperCase().charAt(0);
            if(joyans == answers[i]){
                System.out.println("Correct Answer! hurray!");
                score++;
            }
            else{
                System.out.println("Wrong Answer");
            }
        }
        System.out.println("Quiz is Finished ,Your Score is ="+score);
        sc.close();
    }
}