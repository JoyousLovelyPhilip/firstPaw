public class MaxProfit{
    public static void main(String[] args){
        int[] prices = {10,6,4,3,1};
        int minPrice = prices[0];
        int maxPrice = 0;

        for (int i = 1; i< prices.length ;i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }else{
                int profit = prices[i] -minPrice;

                if(profit > maxPrice){
                    maxPrice = profit;
                }
            }
        }
        System.out.println("The Max Profit:" + maxPrice);
    }
}