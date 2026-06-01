public class joi{
    public static void main(String[] args){
        for(int i = 0; i< 5;i++)//Loop variables are not available outside the loop.
        {
            System.out.println("Loop 0: " + i);
        }
        for(int i= 2; i<=10; i++)//error i made: int i should be initialised from number to be startd from (so int i > 2 is not applicable but , int i =2 is applicable)
        {
            System.out.println("Loop1 :" +i);//variables are only accessible inside the region where they are created. This is called scope.
        }
    }
}