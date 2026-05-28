public class numbu{
    public static void main(String[]  args){
        for(int i = 1;i <= 10;i++){
            if(i==5){
                continue;//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
            }
            System.out.println(i);// prints [...4 6 7...]skips 5
        }
    }  
}