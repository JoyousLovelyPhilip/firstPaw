public class jo{
    public static void main(String[]  args){
        int[] ages= {45,56,77,79,89,34,23,22};
        int length = ages.length;
        float avg,sum = 0;

        for(int age = 0; age < ages.length; age++){
            sum += age;
        }
        avg = sum / length;
        System.out.println("The average Sum of Ages Are: "+ avg);
    }
}