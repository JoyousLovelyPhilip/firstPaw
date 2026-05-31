public class ret{
    static int Return(int x, int y)//If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method
    {
        return x*y ;
    }
    public static void main(String[] args){
        int store = Return(345,678);
        System.out.println(store);
        // we can also store the result in a variable , output: 233910
    }
}