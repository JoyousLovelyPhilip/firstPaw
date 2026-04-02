public class Minnal {
    public static void main(String[] args){
    int tamil = 98;
    int english = 92;
    int maths = 89;
    int science = 98;
    int social = 100;
    String name = "joola";

    int total = (tamil +english + maths+ science+ social);
    int avg = (tamil +english + maths+ science+ social)/5;
    double average = (double) avg;
    System.out.println("Name of the candidate:" +name);
    System.out.println("Total marks :" + total);
    System.out.println("Percentile:"+ average);
      if(total >= 0 && total <= 100){
    System.out.println("Valid Marks");
 }
 else {
    System.out.println("Invalid Marks");

     if (total >= 480){
        System.out.println("Grade: O");
     }
     else if (total >= 400){
        System.out.println("Grade : A");
     }
     else if(total >= 300){
        System.out.println("Grade: B");
     }
     else if(total >= 200){
        System.out.println("Grade: C");
     }
     else {
        System.out.println("FAIL");
     }
}
 }
}