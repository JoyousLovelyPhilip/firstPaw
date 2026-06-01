public class countdow{
    static void CountDown(int q){
        if(q > 0){
        System.out.println(q + "  ");
        CountDown (q - 1);
         }
    }
    public static void main(String[] args){
        CountDown(11);//example demonstrates how to use recursion to create a countdown function
    }
}