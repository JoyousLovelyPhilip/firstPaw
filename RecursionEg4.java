public class fact{
    static int Fact(int n){
        if(n > 0)//By definition, 0! is also 1.
        {
        return n* Fact(n-1);//recursive call
        }
        else{
            return 1;//define return value as 0! = 1 or 1!= 1
        }
    }
    public static void main(String[] args){
        int result = Fact (3);
        System.out.println("The Factorial of 3! :"+ result);//op: 6
    }
}