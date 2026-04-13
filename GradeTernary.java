import java.util.Scanner;
public class GradeTernary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Mark: ");
        int mark = sc.nextInt();

        String grade = (mark >= 90)? "A" : 
                    (mark >=80)? "B": 
                    (mark >= 70)? "C":"Fail";
                     
        System.out.println("The Grade :" +grade);
    }
}