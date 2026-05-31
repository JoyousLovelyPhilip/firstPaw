public class joo{
    static int myjoo(int x){
        return x*3;
    }
    public static void main(String[] args){
        for(int i =1;i<=5;i++){
            System.out.println("The Triple Value of " + i + " is " + myjoo(i));//[3,6,9,12,15]
        }
    }
}