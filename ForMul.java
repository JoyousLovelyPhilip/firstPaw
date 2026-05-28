public class loo{
    public static void main(String[] args){
        for(int i = 1; i<= 3; i++){
            for(int joy = 5; joy <= 10; joy++ ){
                System.out.println(i * joy);
            }
            System.out.println();//prints an empty line.
        }
    //output: [5,6,7,8,9,10    10,12,14,16,18,20   15,18,21,24,27,30]
    }
}