public class Rcur{
    static int Meth(int x, int y ){
        if(y > x)//The halting condition for this recursive method is when y is not greater than x
        {
            return y + Meth(x,y-1);
        }
        else{
            return y;//Infinite recursion is when the method never stops calling itself. Every recursive method should have a halting condition, which is the condition where the method stops calling itself. 
        }
    }
    public static void main(String[] args){
        int result = Meth(6,12);
        System.out.println(result);//op: 63
    }
}