public class loo{
    public static void main(String[] args){
        for (int i= 0; i<= 2; i++){
            System.out.println("outer: " +i);
        
        for(int j = 0; j<=4; j++){
            System.out.println("Inner" +j);
        }// outer :0 ,Inner o,inner 1,...till inner 4 prints
    }
    }
}