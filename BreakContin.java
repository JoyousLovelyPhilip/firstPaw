public class numbu{
    public static void main(String[]  args){
        for(int i = 1;i <= 10;i++){
            if(i==5){
                continue;
            }
            if(i == 7){
                break;
            }//break = stop the loop completely.
                //continue = skip this round, but keep looping.
            
            System.out.println(i);//[1 2 3 4 6]
        }
    }  
}