import java.util.Scanner;
    public class ArrayMark{
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);

            int[] marks = new int [5];
            int total = 0;

            System.out.println("Enter the Marks of 5 Students:");
            for (int i=0; i< marks.length; i++){
                System.out.println("Student" + (i+1)+ ":");
                marks [i]= sc.nextInt();
            }
            int high = marks[0];
            int low = marks[0];
            for (int i =0; i < marks.length; i++){
                total += marks[i];

                if (marks[i]> high){
                    high = marks[i];
                }
                if (marks[i]< low){
                    low = marks[i];
                }
            }
            double avg = (double) total / marks.length;
            System.out.println("\n Marks:");
            for (int i=0; i < marks.length; i++){
                System.out.println(marks[i]+"");
            }

            System.out.println("\n Total =" + total);
            System.out.println("\nAverage =" + avg);
            System.out.println("\n Highest Mark ="+high);
            System.out.println("\nLowest=" + low);

            sc.close();

        }
    }

