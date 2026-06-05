public class evencount{
    public static void main(String[] args){
        int[] li = {3,4,5,6,7,8,9,10};
        int count = 0;

        for(int i = 0; i < li.length; i++){
            if( (li[i] % 2) ==0 ){
                count++;
            }
        }
        System.out.println("The total amount of even numbers are: " + count);
    }
}