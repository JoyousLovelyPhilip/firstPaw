import java.util.Scanner;
public class SwitchEg{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the Day: ");
        int Order = sc.nextInt();

        switch(Order)//The switch should in small ...capital S is error
        {
            case 1:
                System.out.println("Here is your Bobba Tea");
                break;
            case 2: 
                System.out.println("Here is your Matcha Tea");
                break;
            case 3:
                System.out.println("Here is your Indian Chai Tea");
                break;
            case 4:
                System.out.println("Here is your Latte");
                break;
            case 5: 
                System.out.println("Here is your Filter Coffee");
                break;
            case 6:
                System.out.println("Here is your Black Tea");
                break;
            case 7:
                System.out.println("Here is your Lemon Tea");
                break;// output:- Enter the Day: 6, Saturday
            default :
                System.out.println("Please Enter the Valid NUmber! ");
        }// A switch is used to provide alternate options to execute a condition or a block of codes

    }
} 
