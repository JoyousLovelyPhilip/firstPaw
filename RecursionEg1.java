public class recur{
    static int Meth(int s){
        if(s > 0){
            return s+ Meth(s-1);
            //The Error I made : was return s+(s-1)....got output as 69
        }
        else{
            return 0;//Recursion:Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
        }
    }
    public static void main(String[] args){
        int num =Meth(35);//630
        System.out.println("The Total Sum is : " +num);
    }//recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers
}