public class MaxSubarray{
    public static void main(String[] args){
        int[] list ={-2,4,5,-6,-1,9,7};

        int currentSum = list[0];
        int maxSum = list[0];

        for(int i = 1; i< list.length; i++){
            currentSum = Math.max(list[i] , currentSum + list[i]);
            maxSum = Math.max(maxSum , currentSum);

        }
        System.out.println("The Maximum SubArray sum is :" + maxSum);
    }
}