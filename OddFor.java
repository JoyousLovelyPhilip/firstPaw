public class OddFor{
    public static void main(String[]args ){
        int sumOdd = 0;
        int sumEven = 0;
        for(int i =0; i <= 20; i++){
            if(i%2 == 1){
                sumOdd = sumOdd + i;
            }
            else{
                sumEven = sumEven + i;
            }
        }
        System.out.println("The sum of Odd Numbers is : " +sumOdd);
        System.out.println("The sum of Even Numbers is : " +sumEven);
    }
}