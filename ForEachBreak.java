public class numbu{
    public static void main(String[]  args){
        int[] num = {1,2,-4,3,1,4,5};
        for(int n :num){
            if (n < 1){
                continue;
            }
            if(n == 5){
                break;
            }
            System.out.println(n);
        }
        
    }  
}