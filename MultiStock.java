public class MultiStock{
    public static void main(String[] args){
        int[] prices = {7,6,3,4,5};
        int profit = 0;
        
        for(int i =1; i< prices.length; i++){
            if (prices[i] > prices [i-1]){
                profit += prices[i]- prices[i-1];
            }
        }
        System.out.println("Total Profit: " +profit);
    }
}